// reference: https://github.com/dbacinski/Design-Patterns-In-Kotlin/blob/master/patterns/src/test/kotlin/AbstractFactory.kt
interface Plant

class OrangePlant : Plant

class ApplePlant : Plant

abstract class PlantFactory {
    abstract fun makePlant(): Plant

    companion object {
        inline fun <reified T : Plant> createFactory(): PlantFactory =
            when (T::class) {
                OrangePlant::class -> OrangeFactory()
                ApplePlant::class -> AppleFactory()
                else -> throw IllegalArgumentException()
            }
    }
}

class AppleFactory : PlantFactory() {
    override fun makePlant(): Plant = ApplePlant()
}

class OrangeFactory : PlantFactory() {
    override fun makePlant(): Plant = OrangePlant()
}

fun main() {
    val orangePlantFactory = PlantFactory.createFactory<OrangePlant>()
    val orangePlant = orangePlantFactory.makePlant()

    println("Create Plant: $orangePlant")
}
