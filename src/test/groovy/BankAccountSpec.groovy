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
		0              | 10.0            | 10.0
		10.0           | 10.0            | 20.0
	}

	def "100.0 euros balance becomes 1000.0 euros after a deposit of 900.0 euros"() {
		given:
		def currency = " euros"
		def theExpectedBalanceValue = 1000.0
		def theExpectedFormattedBalanceValueInEuros = theExpectedBalanceValue.toString() + currency
		def theInitialBalance = 100.0
		def theDepositValue = 900.0
		def doTheDeposit = theInitialBalance + theDepositValue
		def theActualBalanceValue = doTheDeposit

		when:
		def theActualFormattedBalanceValueInEuros = theActualBalanceValue.toString() + currency

		then:
		theExpectedFormattedBalanceValueInEuros == theActualFormattedBalanceValueInEuros
	}

	private doTheDeposit(initialBalance, theDepositValue) {
		return initialBalance + theDepositValue
	}
}