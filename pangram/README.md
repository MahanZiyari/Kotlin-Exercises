# Pangram

Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan gramma,
"every letter") is a sentence using every letter of the alphabet at least once.
The best known English pangram is:
> The quick brown fox jumps over the lazy dog.

The alphabet used consists of ASCII letters `a` to `z`, inclusive, and is case
insensitive. Input will not contain non-ASCII symbols.

## Making the test suite pass

Execute the tests with:

```bash
$ gradlew test
```

> Use `gradlew.bat` if you're on Windows

In the test suites all tests but the first have been skipped.

Once you get a test passing, you can enable the next one by removing the
`@Ignore` annotation.

## Source

Wikipedia [https://en.wikipedia.org/wiki/Pangram](https://en.wikipedia.org/wiki/Pangram)

