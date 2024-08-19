
def fibonacci(l): 
       sequence = []
       if l <=0:
              return print(sequence)
       elif l == 1:
              return print([0])
       else:
              sequence.append(0)
              sequence.append(1)

              while len(sequence) < l:
                     sequence.append(sequence[-1] + sequence[-2])

       return print(sequence)


length = int(input('Inserire la lunghezza dela successione: '))
fibonacci(length)