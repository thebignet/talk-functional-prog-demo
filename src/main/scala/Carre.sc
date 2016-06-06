def carre(x: Long) = paire(mult, x)

mult(2, 3)

def mult(a: Long, b: Long): Long = a * b

def paire(f: (Long, Long) => Long, x: Long) = f(x, x)

carre(3)

def carre2(x: Long) = puissance(2)(x)

carre(carre(3))
puissance(5)(3)

def puissance(n: Long) = (x: Long) => Math.pow(x, n)

def carre3 = puissance(3)

carre2(4)
carre3(5)
