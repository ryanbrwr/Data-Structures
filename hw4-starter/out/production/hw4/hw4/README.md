# Discussion

**Document all error conditions you determined and why they are error
 conditions. Do this by including the inputs that you used to test your
  program and what error conditions they exposed:**

**Divide By 0**
- For this error, I used the following inputs:
  - `3 0 /`
  - `2 0 /`
- This throws an error because you cannot divide by zero.

**Call `.` on empty stack**
- For this error I used the following input: 
  - `.`
- This throws an error because you can't get the first element of an empty stack

**Call an operation on a stack with one value**
- For this error I used the following input: 
  - `1 +`
- This throws an error because you can't add one value

**Add a decimal to stack**
- For this error I used the following input: 
  - `1.1`
  - `1.1 2 3 ?`
- This throws an error because you can't add a decimal to an integer stack