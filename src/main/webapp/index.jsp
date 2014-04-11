<%@ page import="junior.gitcommit.GitRepositoryStateHelper" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>

<%= GitRepositoryStateHelper.getInstance().gitGitRepositoryState() %>

</body>
</html>