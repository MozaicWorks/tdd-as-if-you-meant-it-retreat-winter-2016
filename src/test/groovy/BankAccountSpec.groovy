import spock.lang.Specification
import spock.lang.Unroll


class BankAccountSpec extends Specification {

	@Unroll
	def "#initialBalance balance becomes #theExpectedBalanceValue after a deposit of #theDepositValue"() {
		when:
		def doTheDeposit = doTheDeposit(initialBalance, theDepositValue)
		def theActualBalanceValue = doTheDeposit

		then:
		theExpectedBalanceValue == theActualBalanceValue

		where:
		initialBalance | theDepositValue | theExpectedBalanceValue
		0              | 1000            | 1000
		500            | 500             | 1000
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