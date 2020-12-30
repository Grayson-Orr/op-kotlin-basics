/*==================================================
Lists
==================================================*/

// In Kotlin, lists can be either mutable or read-only. For list creation, use the std lib functions mutableListOf() & 
// listOf(). To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List
val progLangs: MutableList<String> = mutableListOf("C#", "Go", "Java")
val readOnlyProgLangs: List<String> = progLangs

fun addProgLang(progLang: String) {
  progLangs.add(progLang)
}

fun getProgLanguages(): List<String> {
  return readOnlyProgLangs
}

/*==================================================
Map
==================================================*/

// Collection of key/value pairs where each key is unique & is used to retrieve the corresponding value. For 
// map creation, use the std lib functions mutableMapOf() & mapOf(). To prevent unwanted modifications, obtain read-only 
// views of mutable map by casting them to Map

const val TRANS_FEE: Int = 15

val bankAccounts: MutableMap<String, Int> = mutableMapOf("Rent" to 100, "Groceries" to 100, "KiwiSaver" to 100)
val bankReport: Map<String, Int> = bankAccounts

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

/*==================================================
Set
==================================================*/

// An unordered collection that does not support duplicates. For set creation, use the std lib functions mutableSetOf() 
// & setOf(). To prevent unwanted modifications, obtain read-only views of mutable sets by casting them to Set
val microsoftCEOs: MutableSet<String> = mutableSetOf("Bill Gates", "Steve Ballmer", "Satya Nadella")

fun addCEO(uniqueCEODesc: String): Boolean {                                                       
  return microsoftCEOs.add(uniqueCEODesc)
}

fun getStatusLog(isAdded: Boolean): String {                                                       
  return if (isAdded) "successfully added" else "already exists"
}

fun main() {
  addProgLang("MATLAB")
  println("Total programming languages: ${getProgLanguages().size}")
  getProgLanguages().forEach {
    i -> println(i)
  }

  val newCEO: String = "John Doe"
  val existingCEO: String = "Steve Ballmer"
  println("$newCEO ${getStatusLog(addCEO(newCEO))}")
  println("$existingCEO ${getStatusLog(addCEO(existingCEO))}")

  bankAccountReport()
  addTransactionFee("Rent")
  addTransactionFee("Rent")
  addTransactionFee("Petty")
  bankAccountReport()
}
