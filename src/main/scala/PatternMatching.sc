def sayHello(x: Any): String = s"Bonjour ${titre(x)}"

def titre(x: Any): String = x match {
  case 1 => "un"
  case "Jean" => "Juan"
  case Personne(nom, age) => s"Monsieur ${nom} agé de ${age} ans"
  case nom: String => nom
  case _ => ""
}

case class Personne(nom: String, age: Int)

sayHello("Jean")
sayHello(1)
sayHello("Pierre")
sayHello(Personne("Pierre", 10))
sayHello(Personne("Pierre", 50))
sayHello(Personne("Stéphane", 50))
