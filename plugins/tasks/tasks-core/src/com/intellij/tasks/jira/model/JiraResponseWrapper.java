/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.tasks.jira.model;

import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Auxiliary wrapper object for JIRA tracker responses.
 *
 * @author Mikhail Golubev
 */
public abstract class JiraResponseWrapper {

  private int startAt;
  private int maxResults;
  private int total;

  public int getStartAt() {
    return startAt;
  }

  public int getMaxResults() {
    return maxResults;
  }

  public int getTotal() {
    return total;
  }

  public static class Issues extends JiraResponseWrapper {
    private List<JiraIssue> issues = ContainerUtil.emptyList();

    @NotNull
    public List<JiraIssue> getIssues() {
      return issues;
    }
  }

  public static class Comments extends JiraResponseWrapper {
    private List<JiraComment> comments = ContainerUtil.emptyList();

    @NotNull
    public List<JiraComment> getComments() {
      return comments;
    }
  }
}
