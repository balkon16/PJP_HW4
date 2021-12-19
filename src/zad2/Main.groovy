/**
 *
 * @author Lonca Paweł S23452
 *
 */

package zad2;

static printClientInfo(data, clientId) {
    println("Klient $clientId")
    data.findAll { it.startsWith(clientId) }.each { println(it) }
    println()
}

def f = new File("./customers.txt")
println("Nazwiska")
f.readLines()
        .collect { [new Tuple2(it.split(";")[1].split(" ")[0], it.split(";")[0]), it] }
        .sort { o1, o2 -> o1[0][0] <=> o2[0][0] ?: o1[0][1] <=> o2[0][1] }
        .each { println(it[1]) }
println()
println("Koszty")
f.readLines()
        .collect { [new Tuple2(new BigDecimal(it.split(";")[3]) * new BigDecimal(it.split(";")[4]), it.split(";")[0]), it] }
        .sort { o1, o2 -> o2[0][0] <=> o1[0][0] ?: o1[0][1] <=> o2[0][1] }
        .each { println("${it[1]} (koszt: ${it[0][0]})") }
println()
printClientInfo(f.readLines(), "c00001")
printClientInfo(f.readLines(), "c00002")