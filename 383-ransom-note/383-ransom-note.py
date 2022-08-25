class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        result = False
        for i in ransomNote:
            valueRansomNote = ransomNote.count(i)
            valueMagazine = magazine.count(i)
            if 1<=valueRansomNote <= valueMagazine:
                result = True
            else:
                result = False
                break
        return result