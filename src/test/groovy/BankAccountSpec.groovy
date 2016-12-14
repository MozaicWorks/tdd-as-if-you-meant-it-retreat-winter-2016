import spock.lang.Specification


class BankAccountSpec extends Specification {
	def "0 balance becomes 1000 after a deposit of 1000"() {
		when:
		def doTheDeposit = doTheDeposit(initialBalance, theDepositValue)
		def theActualBalanceValue = doTheDeposit

		then:
		theExpectedBalanceValue == theActualBalanceValue

		where:
		initialBalance | theDepositValue | theExpectedBalanceValue
		0              | 1000            | 1000
	}

	def "500 balance becomes 1000 after a deposit of 500"() {
		given:
		def initialBalance = 500
		def theDepositValue = 500
		def theExpectedBalanceValue = 1000

		when:
		def doTheDeposit = doTheDeposit(initialBalance, theDepositValue)
		def theActualBalanceValue = doTheDeposit

		then:
		theExpectedBalanceValue == theActualBalanceValue
	}

	def "-100 balance becomes 1000 after a deposit of 1100"() {
		given:
		def initialBalance = -100
		def theDepositValue = 1100
		def theExpectedBalanceValue = 1000

		when:
		def doTheDeposit = doTheDeposit(initialBalance, theDepositValue)
		def theActualBalanceValue = doTheDeposit

		then:
		theExpectedBalanceValue == theActualBalanceValue
	}

	private doTheDeposit(int initialBalance, int theDepositValue) {
		return initialBalance + theDepositValue
	}
}