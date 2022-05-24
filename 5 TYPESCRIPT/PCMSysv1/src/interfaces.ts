interface NetBanking {
  customerId: string;
  pin: number;
  displayAccountDetails(): void;
  getAccountDetails(): string;
}

class SavingsAccount {
  customerId: string;
  pin: number;
  constructor(customerId: string, pin: number) {
    this.customerId = customerId;
    this.pin = pin;
  }
  displayAccountDetails(): void {
    console.log(this.customerId, ">>>", this.pin);
  }
  getAccountDetails(): string {
    return "Retuning : " + this.customerId + ">>>" + this.pin;
  }
}

const netBanking: NetBanking = new SavingsAccount("c1", 123);
netBanking.displayAccountDetails();
const returnVal: string = netBanking.getAccountDetails();
console.log(returnVal);
