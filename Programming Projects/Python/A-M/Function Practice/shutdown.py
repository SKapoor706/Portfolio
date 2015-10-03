def shut_down(s):
    if s == "Yes" or s == "yes" or s == 'YES':
        return "Shutting Down"
    elif s == "No" or s == 'no':
        return "Shutdown aborted"
    else:
        return "Sorry"