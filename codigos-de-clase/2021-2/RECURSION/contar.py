sebastian = "xxoxx".count("x")

def contar (string, ch, i):
        if len(string) == i:
            return 0 
        elif string[i] == ch:
            return 1 + contar(string, ch, i+1)
        else:
            return 0 + contar(string, ch, i+1)

def contar2 (string, ch):
        if string == "":
            return 0 
        elif string[0] == ch:
            return 1 + contar2(string[1: ], ch)
        else:
            return contar2(string[1: ], ch)

print(contar("xxoxx","x",0))