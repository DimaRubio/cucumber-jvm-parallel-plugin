import org.junit.Assert

import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace

def outputPath = "target/generated-test-sources/cucumber/"
File suite01 = new File(basedir, outputPath + "Parallel01IT.java")
File suite02 = new File(basedir, outputPath + "Parallel02IT.java")

assert suite01.isFile()
assert suite02.isFile()

String expected01 = "// This is a custom template for Parallel01IT"
String expected02 = "// This is a custom template for Parallel02IT"

Assert.assertThat(suite01.text, equalToIgnoringWhiteSpace(expected01))
Assert.assertThat(suite02.text, equalToIgnoringWhiteSpace(expected02))

