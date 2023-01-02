"""Naive patterntern matching algorithm
        1)Define Pattern and the test string
        2) traverse through the pattern and the test string ( i is test string, j is pattern string)
        3) if the character is matching then increment i and j
        4) if not increment i and backtrack j
"""
def search(pattern, test):
    M = len(pattern)
    N = len(test)
 
    # A loop to slide pat[] one by one */
    for i in range(N - M + 1):
        j = 0
 
        # For current index i, checkujikol p;                                                                        
        # for pattern match */
        while(j < M):
            if (test[i + j] != pattern[j]):
                break
            j += 1
 
        if (j == M):
            print("Pattern found at index ", i)
 
 

test = "AABAACAADAABAAABAA"
pattern = "AABA"
     
# Function call
search(pattern, test)