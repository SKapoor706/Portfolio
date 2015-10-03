__author__ = 'Aman'
print "------------------Welcome to your Phone Book!------------------"
class PhoneBook(object):
    book = {}
    def __init__(self, contact_name, contact_num):
        self.contact_name = contact_name
        self.contact_num = contact_num
    def add_contact(self, contact_name, contact_num):
        book[contact_name] = contact_num

ph = PhoneBook
loop = 0
while loop == 0:
    yorn = raw_input("Do you want to see your phonebook? (Y/N) \n")

    if yorn == 'y' or yorn == 'Y':
        print ph.book
    elif yorn is not 'YyNn':
        print "Please reply with Y or N."

    yorn2 = raw_input('Do you want to add a contact? (Y/N) \n')

    if yorn2=='y' or yorn2=='Y':
        x = raw_input('Name: ')
        y = raw_input('Phone #: ')
        ph.add_contact(x,y)
    elif yorn2=='n' or yorn2=='N':
        yorn3 = raw_input("Do you wanna stay here? (Y/N) \n")
        if yorn3 =='n' or yorn3=='N':
            print 'Goodbye!'
            break
    else:
        print "Please reply with Y or N."