def puissance(a, b):
    return a ** b

import fonctions as f

while True:
    try:
        a = int(input("Entrez le premier nombre : "))
        b = int(input("Entrez le deuxième nombre : "))
        result = f.puissance(a, b)
        print(f"{a} élevé à la puissance {b} est {result}")
    except KeyboardInterrupt:
        print("\nFin du programme.")
        break

