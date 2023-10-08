try:
    a = int(input())
    b = int(input())

    x = a + b

    print("X =", x)
except ValueError:
    print("Entrada inválida. Certifique-se de inserir números inteiros.")
