from pydantic import BaseModel
from typing import List

class KnowledgeItem(BaseModel):
  id: str
  content: str

class DalaRecord(BaseModel):
  itemId: str
  numWords: int = -1
  start: int = -1
  end: int = -1
  content: str = ""

paragraph_splitter = r'(\r\n|\r|\n)\s*(\r\n|\r|\n)*'
sentence_splitter = r'(\.\s+|\s*$)'
word_splitter = r'\s+'

def splitIntoRecords (item: KnowledgeItem, minWordCount: int, maxWordCount: int) -> List[DalaRecord]:
  print("Implement me!")
  return []

def main():
  filename = "Emotions.txt"
  with open(filename) as file:
    content = file.read()
    item = KnowledgeItem(id=filename, content=content)
    for record in splitIntoRecords(item, 165, 200):
      print(record)

main()
