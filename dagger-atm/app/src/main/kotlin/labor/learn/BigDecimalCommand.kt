package labor.learn

import labor.learn.commands.Outputer
import labor.learn.commands.Result
import java.math.BigDecimal

abstract class BigDecimalCommand(
    var outputer: Outputer,
) : SingleArgCommand() {
    final override fun handleArg(arg: String): Result {
        var amount = tryParse(arg)

        if (amount == null) {
            outputer.output(arg + "Is Not Valid Number")
        } else if (amount.signum() <= 0) {
            outputer.output("Amount Must Be Possitive")
        } else {
            handleAmount(amount)
        }

        return Result.handled()
    }

    protected abstract fun handleAmount(amount: BigDecimal)

    companion object {
        private fun tryParse(arg: String): BigDecimal? {
            try {
                return BigDecimal(arg)
            } catch (e: NumberFormatException) {
                return null
            }
        }
    }
}
