package labor.learn

import labor.learn.PerSession
import java.math.BigDecimal
import javax.inject.Inject

@PerSession
class WithdrawalLimiter
    @Inject
    constructor(
        private var remainingWithdrawalLimit: BigDecimal,
        @MaximumWithdrawal maximumWithdrawal: BigDecimal,
    ) {
        fun recordDeposit(amount: BigDecimal) {
            remainingWithdrawalLimit = amount
        }

        fun recordWithdrawal(amount: BigDecimal) {
            remainingWithdrawalLimit -= amount
        }

        fun remainingWithdrawalLimit(): BigDecimal = remainingWithdrawalLimit
    }
