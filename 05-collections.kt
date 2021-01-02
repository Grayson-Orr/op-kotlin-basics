fun addProgLang(progLang: String) {
  progLangs.add(progLang)
}

fun getProgLanguages(): List<String> {
  return readOnlyProgLangs
}

fun addTransactionFee(accountName: String) {
  if (bankAccounts.containsKey(accountName)) {
    println("Updating $accountName...")
    bankAccounts[accountName] = bankAccounts.getValue(accountName) - TRANS_FEE
  } else {
    println("Error: Trying to add transaction fee to a non-existing account - $accountName")
  } 
}

fun bankAccountReport() {
  println("Bank account report:")
  bankReport.forEach {
    k, v -> println("$k - $$v")
  }
}

fun addCEO(uniqueCEODesc: String): Boolean {                                                       
  return microsoftCEOs.add(uniqueCEODesc)
}

fun getStatusLog(isAdded: Boolean): String {                                                       
  return if (isAdded) "was successfully added" else "already exists"
}

fun main() {
  val progLangs: MutableList<String> = mutableListOf("C#", "Go", "Java")
  val readOnlyProgLangs: List<String> = progLangs
 
  addProgLang("MATLAB")
  println("Total programming languages: ${getProgLanguages().size}") // Total programming languages: 4
  getProgLanguages().forEach {
    i -> println(i)
  }
  
  const val TRANS_FEE: Int = 15  
  val bankAccounts: MutableMap<String, Int> = mutableMapOf("YouMoney" to 100, "Personal OnCall" to 100, "Rapid Save" to 100)
  val bankReport: Map<String, Int> = bankAccounts
 
  bankAccountReport()
  addTransactionFee("Rapid Save") 
  addTransactionFee("Rapid Save") 
  addTransactionFee("Term Deposit")
  bankAccountReport()
  
  val microsoftCEOs: MutableSet<String> = mutableSetOf("Bill Gates", "Steve Ballmer", "Satya Nadella")
  val newCEO: String = "John Doe"
  val existingCEO: String = "Steve Ballmer"
  
  println("$newCEO ${getStatusLog(addCEO(newCEO))}")
  println("$existingCEO ${getStatusLog(addCEO(existingCEO))}")
}
