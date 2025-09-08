package labor.learn

import labor.learn.commands.Database
import labor.learn.commands.Database.Account
import java.math.BigDecimal
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InMemoryDatabase
    @Inject
    constructor() : Database {
        private val accounts = mutableMapOf<String, Account>()

        override fun getAccount(username: String): Account = accounts.getOrPut(username) { InMemoryAccount(username) }

        private class InMemoryAccount(
            private val username: String,
        ) : Database.Account {
            private var balance: BigDecimal = BigDecimal.ZERO

            override fun username(): String = username

            override fun deposit(amount: BigDecimal) {
                checkNonNegative(amount, "deposit")
                balance = balance.add(amount)
            }

            override fun withdraw(amount: BigDecimal) {
                checkNonNegative(amount, "withdraw")
                balance = balance.subtract(amount)
            }

            private fun checkNonNegative(
                amount: BigDecimal,
                action: String,
            ) {
                if (amount.signum() == -1) {
                    throw IllegalArgumentException(
                        "Cannot $action negative amounts: $amount",
                    )
                }
            }

            override fun balance(): BigDecimal = balance
        }
    }
