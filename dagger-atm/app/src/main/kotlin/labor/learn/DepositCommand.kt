package labor.learn

import labor.learn.commands.Database.Account
import labor.learn.commands.Outputer
import java.math.BigDecimal
import javax.inject.Inject

class DepositCommand
    @Inject
    constructor(
        outputer: Outputer,
        val account: Account,
        var withdrawalLimit: WithdrawalLimiter,
    ) : BigDecimalCommand(outputer) {
        override fun handleAmount(amount: BigDecimal) {
            account.deposit(amount)
            withdrawalLimit.recordDeposit(amount)
            outputer.output("new balance is: " + account.balance())
        }

        override fun key(): String = "DepositCommand"
    }
