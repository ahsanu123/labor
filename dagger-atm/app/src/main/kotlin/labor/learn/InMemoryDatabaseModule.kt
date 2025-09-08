package labor.learn

import dagger.Binds
import dagger.Module

@Module
interface InMemoryDatabaseModule {
    @Binds
    fun inMemory(database: InMemoryDatabase)
}
