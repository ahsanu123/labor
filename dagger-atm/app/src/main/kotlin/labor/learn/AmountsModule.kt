package labor.learn

import dagger.Module
import dagger.Provides
import labor.learn.MinimumBalance
import java.math.BigDecimal

@Module
abstract class AmountsModule {
    companion object {
        @Provides
        @MinimumBalance
        fun minimumBalance(): BigDecimal = BigDecimal.ZERO

        @Provides
        @MaximumWithdrawal
        fun maximumWithdrawal(): BigDecimal = BigDecimal(1000)
    }
}
