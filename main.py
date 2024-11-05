from RUN_ME import class_name, data_type
with open("BinarySearchTreeTemplate.java", 'r') as f:
    data = f.read()

with open(f"{class_name}.java", 'w') as f:
    data = data.replace("String", data_type)
    data = data.replace("BinarySearchTreeTemplate", class_name)
    f.write(data)

