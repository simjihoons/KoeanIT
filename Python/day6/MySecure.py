def secure_name(name):
    return name[0] + "**"

def secure_id(id):
    return id[8] + "******"

def secure_tel(tel):
    return tel.replace(tel[4:8],"****")