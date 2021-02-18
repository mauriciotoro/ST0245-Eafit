inicio = time()
for i in range(8000000, 28000000):
print(arrayMax(array_generator(i)))
fin = time()
total = fin-inicio
print("The run time of the program is", total)
