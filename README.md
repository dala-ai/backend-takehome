# Welcome
Thank you for taking time to apply to Dala.

This exercise is designed to be a well-scoped, time-bounded exercise to learn
about how you think in code. It's designed after a real world problem that we've
faced, and can be done within an hour. This exercise will
give us a sense of how you think about API design and trade-offs.

# Exercise
In this exercise, we obtain a plain text doc (`Emotions.txt`) that mimics a
document that might come from a 3rd party knowledge repository (e.g. Google Docs).
Because our machine learning models are most accurate at specific lengths of
text, we need to split this doc into smaller pieces in order to send it off to
be indexed.

This codebase is set up with some boilerplate scala and python code to read the
doc, and a method to split the doc into a list of DalaRecords, which are
containers of the split text, as well as `start` and `end` character indexes
representing where in the original document the record came from.

Your task is to implement the `splitIntoRecords` method in the language of your
choice. Your submission should print the list of records, along with the start
and end index from the original doc, as well as the word count of each record.

A sample output for the first few DalaRecords and the parameters
`minWordCount = 80` and `maxWordCount = 120` is available in `sample.json`.

## Requirements
1. Records should only contain sentences from the same paragraph.
2. Each record should only contain full sentences.
3. Each record should contain at least the minimum number of words, and at most
   the maximum number of words passed into the method, inclusive. The default
   thresholds provided in the boilerplate are an example: your method should
   accept any minimum and maximum threshold and return the corresponding records.

## Exceptions
1. If a sentence has more words than the maximum threshold, it may be the only 
   sentence in that record.
2. The last (or only) sentence in a paragraph may contain fewer words than the 
   minimum threshold.


# Instructions
- Do not take more than 1 hour to complete this exercise.
- At the end of 1 hour, document any choices you have made, what you would've
  done differently, and what else you would've done if you had more time inside
  of `SOLUTION.md`.
- You may choose to implement this any other language of your choice, as long as
  it fulfills the requirements. 
- You only need to implement this in one language.
- You may use any of the existing code, or rewrite everything from scratch.
- Use git as you would working on a team.
- Feel free to get in touch with us at careers@dala.ai if you have any questions.
- At the end, zip up the entire folder and email it to careers@dala.ai.
- Good luck and have fun!
