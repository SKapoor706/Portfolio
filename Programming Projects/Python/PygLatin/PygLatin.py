__author__ = 'Aman'
print "Welcome to the Pig Latin Machine!"
pyg = "ayylmao"
print 'Suffix of the Day: ' + '"' + pyg + '"'
original = raw_input("Enter a word: ")
if len(original) > 0 and original.isalpha() :
    word = original.lower()
    first = word[0]
    new_word = word[1:len(word)] + first + pyg
    print new_word
elif original == "You Suck":
    print "No, you suck. Try Again."
else:
    print "Try Again"

