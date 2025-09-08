package labor.learn

import dagger.Module
import dagger.Provides
import labor.learn.commands.Database
import labor.learn.commands.Database.Account

@Module
interface AccountModule {
    companion object {
        @Provides
        fun account(
            database: Database,
            @Username username: String,
        ): Account = database.getAccount(username)
    }
}
