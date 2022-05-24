class SavingsAccount {
    constructor(customerId, pin) {
        this.customerId = customerId;
        this.pin = pin;
    }
    displayAccountDetails() {
        console.log(this.customerId, ">>>", this.pin);
    }
    getAccountDetails() {
        return "Retuning : " + this.customerId + ">>>" + this.pin;
    }
}
const netBanking = new SavingsAccount("c1", 123);
netBanking.displayAccountDetails();
const returnVal = netBanking.getAccountDetails();
console.log(returnVal);
