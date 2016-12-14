import spock.lang.Specification
import spock.lang.Unroll


class BankAccountSpec extends Specification {

	@Unroll
	def "#initialBalance balance becomes #theExpectedBalanceValue after a deposit of #theDepositValue"() {
		when:
		def theActualBalanceValue = doTheDeposit(initialBalance, theDepositValue)

		then:
		theExpectedBalanceValue == theActualBalanceValue

		where:
		initialBalance | theDepositValue | theExpectedBalanceValue
		0              | 1000            | 1000
		500            | 500             | 1000
		-100           | 1100            | 1000
		0              | 100             | 100
	}

	private doTheDeposit(int initialBalance, int theDepositValue) {
		return initialBalance + theDepositValue
	}
}