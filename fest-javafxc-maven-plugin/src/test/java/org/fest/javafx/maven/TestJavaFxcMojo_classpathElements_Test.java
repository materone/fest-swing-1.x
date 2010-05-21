/*
 * Created on May 17, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.javafx.maven;

import org.junit.*;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.util.Collections.list;

/**
 * Tests for <code>{@link JavaFxcMojo#classpathElements()}</code>.
 *
 * @author Alex Ruiz
 */
public class TestJavaFxcMojo_classpathElements_Test {

  private TestJavaFxcMojo mojo;

  @Before
  public void setUp() {
    mojo = new TestJavaFxcMojo();
  }

  @Test
  public void should_return_classpath_elements() {
    mojo.testClasspathElements = list("javafxc.jar");
    assertThat(mojo.classpathElements()).isEqualTo(mojo.testClasspathElements);
  }
}