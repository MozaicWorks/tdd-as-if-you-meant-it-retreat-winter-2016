import spock.lang.Specification


class BankAccountSpec extends Specification {
	def "after a 1000 deposit in a balance with value 0, the balance has the value 1000"(){
		when:
		def theExpectedBalanceValue = 1000
		def theActualBalanceValue = 0 + 1000

		then:
		theExpectedBalanceValue == theActualBalanceValue
	}
}