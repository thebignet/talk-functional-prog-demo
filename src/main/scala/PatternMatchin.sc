case class Personne(nom: String, age: Int)

def sayHello(x: Any): String = s"Bonjour ${titre(x)}"

def titre(x: Any): String = x match {
  case 1 => "un"
  case "Jean" => "Juan"
  case Personne(nom, age) => s"Monsieur ${nom} agé de ${age} ans"
  case nom: String => nom
  case _ => ""
}

println(sayHello("Jean"))
println(sayHello(1))
println(sayHello("Pierre"))
println(sayHello(Personne("Pierre", 10)))
println(sayHello(Personne("Pierre", 50)))
println(sayHello(Personne("Stéphane", 50)))
