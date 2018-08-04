import base64
def to_base_64(string):
    return base64.b64encode(bytes(string)).replace('=', "")
    
def from_base_64(string):
    missing_padding = len(string) % 4
    if missing_padding != 0:
        string += b'='* (4 - missing_padding)
    return base64.decodestring(string)
