class Solution {
    public:
        int gcd(int n, int m) {
            if(n % m == 0)
                return m;
            return gcd(m, n % m);
        }
    
        string filterGCDString(string str1, string str2) {
            int str1Length = str1.length();
            int str2Length = str2.length();
            int gcdValue = gcd(str1Length, str2Length);
    
            if(str1Length > str2Length) str1 = str2;
    
            string filter;
            for(int i = 0; i < gcdValue; ++i) {
                filter.push_back(str1[i]);
            }
            // cout << "total length : " << gcdValue << endl;
            
            return filter;
        }
    
        bool checkStrings(string str, string compareStr) {
            int gcdValue = compareStr.length();
    
            // cout << "comapreStr = " << compareStr << endl;
            for(int i = 0, j = 0; i < str.length(); ++i, ++j) {
                // cout << str[i] << " " << compareStr[j] << endl;
                if(j == gcdValue)
                    j = 0;
            
                if(str[i] != compareStr[j])
                    return 0;
            }
            return 1;
        }
    
        string gcdOfStrings(string str1, string str2) {
            string temp = filterGCDString(str1, str2);
    
            if(checkStrings(str1, temp) == 0 || checkStrings(str2, temp) == 0)
                temp = "";
            return temp;
        }
    };