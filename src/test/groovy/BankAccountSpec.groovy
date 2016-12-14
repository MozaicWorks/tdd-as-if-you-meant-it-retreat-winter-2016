import spock.lang.Specification


class BankAccountSpec extends Specification {
	def "0 balance becomes 1000 after a deposit of 1000"(){
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

	def "500 balance becomes 1000 after a deposit of 500"() {
		given:
		def initialBalance = 500
		def theDepositValue = 500
		def theExpectedBalanceValue = 1000

		when:
		def doTheDeposit = initialBalance + theDepositValue
		def theActualBalanceValue = doTheDeposit

		then:
		theExpectedBalanceValue == theActualBalanceValue
	}
}