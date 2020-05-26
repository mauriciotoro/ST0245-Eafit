#!/usr/bin/python

def hanoi(topN, a = "Tower1", b = "Tower2", c = "Tower3"):
    if (topN == 1):
        print "move " + __ + " to " + ___
    else:
        hanoi(topN - 1, ___, ___, ___)
        print "move " + ____ + " to " + ___
        hanoi(topN - 1, ___, ___, ___)

def subset(s, base = ""):
    if len(s) == ___:
        print ___
    else:
        subset(s[1:], base + ____)
        subset(s[1:], base)

def permutations(base, str):
    if len(str) == ___:
        print ____
    else:
        i = 0
        while i < len(str):
            permutations(base + ____, str[__:___] + str[___:])
            i = i + 1
