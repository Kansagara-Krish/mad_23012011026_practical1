class BankAccount {
    private var balance = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        } else {
            println("Insufficient balance")
        }
    }

    fun printBalance() {
        println("Balance: $$balance")
    }
}

fun main() {
    val account = BankAccount()
    account.deposit(100.0)
    account.withdraw(30.0)
    account.printBalance()
}
