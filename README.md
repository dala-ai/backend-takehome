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
containers of the split text with reference to where in the original doc they
came from.

Your task is to implement the `splitIntoRecords` method. Your submission should
print the list of records, along with the start and end index from the original
doc, as well as the word count of each record.

# Requirements
- Records should only contain sentences from the same paragraph.
- Each record should only contain full sentences, and not have any dangling words.
- Each record should contain at least the minimum number of words, and at most
  the maximum number of words passed into the method, inclusive.
- If a sentence has more words than the maximum number of words, it may be the
  only sentence in that record.
- A paragraph with less than the minimum threshold results in a single record.
- The last sentence in a paragraph may contain less than the minimum threshold.


# Instructions
- Do not take more than 1 hour to complete this exercise
- At the end of 1 hour, document any choices you have made, what you would've
  done differently, and what else you would've done if you had more time inside
  of `SOLUTION.md`
- You may use any of the existing code, or rewrite everything from scratch
- You may choose to implement this in any other language, as long as it
  fulfills the requirements
- Use git to as you would working on a team
- Feel free to get in touch with us at careers@dala.ai if you have any questions.
- At the end, zip up the entire folder and email it to careers@dala.ai.

Good luck and have fun!
