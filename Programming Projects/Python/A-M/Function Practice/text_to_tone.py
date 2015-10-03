__author__ = 'Aman'
print "WELCOME TO THE TEXT 2 TONE TRANSLATOR!"

def shout(ph):
    if ph == ph.upper():
        print "YOU'RE SHOUTING!"
    elif ph == ph.lower():
        print "Can you speak up?"
    else:
        print "I can hear you well."

input = raw_input("Type a phrase and I can tell you how loud you are speaking: " + '\n')
shout(input)