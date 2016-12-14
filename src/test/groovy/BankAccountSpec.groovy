import spock.lang.Specification


class BankAccountSpec extends Specification {
	def "after a 1000 deposit in a balance with value 0, the balance has the value 1000"(){
		given:
		def initialBalance = 0
		def theDepositValue = 1000
		def theExpectedBalanceValue = 1000

		when:
		def doTheDeposit = initialBalance + theDepositValue
		def theActualBalanceValue = doTheDeposit

		then:
		theExpectedBalanceValue == theActualBalanceValue
	}

	def "after 500 deposit in a balance of 500, the balance has the value 1000"() {
		given:
		def theActualBalanceValue = -1
		def theExpectedBalanceValue = 1000

		when:
		theActualBalanceValue = 500 + 500

		then:
		theExpectedBalanceValue == theActualBalanceValue
	}
}