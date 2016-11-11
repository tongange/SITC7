<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- login --%>
<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled is-u2f-enabled">
<head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta content="origin" name="referrer"/>
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/frameworks-c90d888b6f5151dadd198c29754c69062ad2d2b96ccd6484e1439cff77089623.css" integrity="sha256-yQ2Ii29RUdrdGYwpdUxpBirS0rlszWSE4UOc/3cIliM=" media="all" rel="stylesheet"/>
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-de9b31a46c0da01f58344e7f74adc0e2adaf59ffd110eb40e68260acd9b1610a.css" integrity="sha256-3psxpGwNoB9YNE5/dK3A4q2vWf/REOtA5oJgrNmxYQo=" media="all" rel="stylesheet"/>
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/site-7cc71df50ca0ee0accd9016b40404b47db9123deb18de17f0c88ce650ce696d1.css" integrity="sha256-fMcd9Qyg7grM2QFrQEBLR9uRI96xjeF/DIjOZQzmltE=" media="all" rel="stylesheet"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=device-width">
    <title>Sign in to StudentManagement</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" href="/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="/apple-touch-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="/apple-touch-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon-180x180.png">
    <meta property="fb:app_id" content="1401488693436528">
    <meta property="og:url" content="https://github.com">
    <meta property="og:site_name" content="GitHub">
    <meta property="og:title" content="Build software better, together">
    <meta property="og:description" content="GitHub is where people build software. More than 18 million people use GitHub to discover, fork, and contribute to over 47 million projects.">
    <meta property="og:image" content="https://assets-cdn.github.com/images/modules/open_graph/github-logo.png">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="1200">
    <meta property="og:image:height" content="1200">
    <meta property="og:image" content="https://assets-cdn.github.com/images/modules/open_graph/github-mark.png">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="1200">
    <meta property="og:image:height" content="620">
    <meta property="og:image" content="https://assets-cdn.github.com/images/modules/open_graph/github-octocat.png">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="1200">
    <meta property="og:image:height" content="620">
    <meta property="twitter:site" content="github">
    <meta property="twitter:site:id" content="13334762">
    <meta property="twitter:creator" content="github">
    <meta property="twitter:creator:id" content="13334762">
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:title" content="GitHub">
    <meta property="twitter:description" content="GitHub is where people build software. More than 18 million people use GitHub to discover, fork, and contribute to over 47 million projects.">
    <meta property="twitter:image:src" content="https://assets-cdn.github.com/images/modules/open_graph/github-logo.png">
    <meta property="twitter:image:width" content="1200">
    <meta property="twitter:image:height" content="1200">
    <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <meta name="pjax-timeout" content="1000">
    <meta name="request-id" content="DFA65623:3209:9012C8E:58240882" data-pjax-transient>
    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="/login" data-pjax-transient>
    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
    <meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
    <meta name="google-analytics" content="UA-3769691-2">
    <meta content="collector.githubapp.com" name="octolytics-host"/>
    <meta content="github" name="octolytics-app-id"/>
    <meta content="DFA65623:3209:9012C8E:58240882" name="octolytics-dimension-request_id"/>
    <meta content="true" data-pjax-transient="true" name="analytics-location-query-strip"/>
    <meta class="js-ga-set" name="dimension1" content="Logged Out">
    <meta name="hostname" content="github.com">
    <meta name="user-login" content="">
    <meta name="expected-hostname" content="github.com">
    <meta name="js-proxy-site-detection-payload" content="MjE0M2Q1ODgyZTRkZTNjM2NlYjgzNTAwYWI0N2RlZTUzYThjODM3NTI3ZjQxNDhjMzM0YTkxNjA2MTNiYzE2Mnx7InJlbW90ZV9hZGRyZXNzIjoiMjIzLjE2Ni44Ni4zNSIsInJlcXVlc3RfaWQiOiJERkE2NTYyMzozMjA5OjkwMTJDOEU6NTgyNDA4ODIiLCJ0aW1lc3RhbXAiOjE0Nzg3NTY0OTEsImhvc3QiOiJnaXRodWIuY29tIn0=">
    <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#4078c0">
    <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">
    <meta name="html-safe-nonce" content="9b19af32268e57c6256b018e21d37e10d5c6d761">
    <meta content="2d1b7e3cd9513e37a9c59e195d6f139526cb4996" name="form-nonce"/>
    <meta http-equiv="x-pjax-version" content="123845ef29cd4ba2e5823227e1a26a12">
    <meta name="description" content="GitHub is where people build software. More than 18 million people use GitHub to discover, fork, and contribute to over 47 million projects.">
    <link rel="canonical" href="https://github.com/login" data-pjax-transient>

    <!-- include mine js -->
    <jsp:include page="/include/jQuery1_11_3.jsp"></jsp:include>
    <script type="text/javascript" src="<c:url value="/js/student/qin.doMainView.js"/> "></script>
    <!-- include mine js -->

</head>
<body class="logged-out  env-production windows  session-authentication page-responsive min-width-0">
<div id="js-pjax-loader-bar" class="pjax-loader-bar">
    <div class="progress"></div>
</div>
<a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
<div class="header header-logged-out width-full pt-5 pb-4" role="banner">
    <div class="container clearfix width-full">
        <%-- <a class="header-logo" href="https://github.com/" aria-label="Homepage"
            data-ga-click="(Logged out) Header, go to homepage, icon:logo-wordmark">
             <svg aria-hidden="true" class="octicon octicon-mark-github" height="48" version="1.1" viewBox="0 0 16 16" width="48">
                 <path fill-rule="evenodd"
                       d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/>
             </svg>
         </a>--%>
        <a class="header-logo" aria-label="Homepage"
           data-ga-click="(Logged out) Header, go to homepage, icon:logo-wordmark">
            <svg aria-hidden="true" class="octicon octicon-mark-github" height="48" version="1.1" viewBox="0 0 16 16" width="48">
                <path fill-rule="evenodd"
                      d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/>
            </svg>
        </a>
    </div>
</div>
<div id="start-of-content" class="accessibility-aid"></div>
<div role="main">
    <div id="js-pjax-container" data-pjax-container>
        <div class="auth-form px-3" id="login" style="width: 500px;">
            <!-- '"` --><!-- </textarea></xmp> --></option></form>
            <%--<form accept-charset="UTF-8" action="/session" data-form-nonce="2d1b7e3cd9513e37a9c59e195d6f139526cb4996" method="post">--%>
            <div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;"/><input name="authenticity_token" type="hidden" value="bRZKNUK8TqVV1C83Zj2KVyF3UFZFVGGQ23tG/381VySeu5tIbWtmr4DxUetuHNMJIhb77UOv8sHlJJb9/W3Ziw=="/></div>
            <div class="auth-form-header p-0">
                <h1>Sign in to StudentManagement</h1>
            </div>
            <div id="js-flash-container">
            </div>
            <div class="auth-form-body mt-3">
                <label>Username</label>
                <input autocapitalize="off" autocorrect="off" autofocus="autofocus"
                       class="form-control input-block" id="studentName" name="studentName"
                       tabindex="1" type="text"/>
                <label>Email</label>
                <input autocapitalize="off" autocorrect="off" autofocus="autofocus"
                       class="form-control input-block" id="studentEmail" name="studentEmail"
                       tabindex="1" type="text"/>
                <label>StuId</label>
                <input autocapitalize="off" autocorrect="off" autofocus="autofocus"
                       class="form-control input-block" id="h5_stuId" name="h5_stuId"
                       tabindex="1" type="text"/>

                <input class="btn btn-primary btn-block" data-disable-with="Signing in…" name="commit" id="commit" tabindex="3"
                       type="button" value="Sign in" onclick="doLogin()"/>
            </div>
            <%--<p class="create-account-callout mt-3">
                New to GitHub?
                <a href="/join?source=login" data-ga-click="Sign in, switch to sign up">Create an account</a>.
            </p>--%>
        </div>
    </div>
    <div class="modal-backdrop js-touch-events"></div>
</div>
<div class="site-footer" role="contentinfo">
    <%-- <ul class="site-footer-links">
         <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
         <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
         <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
         <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact GitHub</a></li>
     </ul>--%>
</div>
<div id="ajax-error-message" class="ajax-error-message flash flash-error">
    <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16">
        <path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/>
    </svg>
    <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
        <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12">
            <path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/>
        </svg>
    </button>
    You can't perform that action at this time.
</div>
<script crossorigin="anonymous" integrity="sha256-Wwa0TausKvVP3LAzLpVO6/6XA7WLtZgyeMa5s5Ll9EE=" src="https://assets-cdn.github.com/assets/frameworks-5b06b44dabac2af54fdcb0332e954eebfe9703b58bb5983278c6b9b392e5f441.js"></script>
<script async="async" crossorigin="anonymous" integrity="sha256-Hzzm1L/VTzLs8iKR2ReC/yYbkyRSMrbuGeg+x+IxVgk=" src="https://assets-cdn.github.com/assets/github-1f3ce6d4bfd54f32ecf22291d91782ff261b93245232b6ee19e83ec7e2315609.js"></script>
<div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none">
    <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16">
        <path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/>
    </svg>
    <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
    <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
</div>
<div class="facebox" id="facebox" style="display:none;">
    <div class="facebox-popup">
        <div class="facebox-content" role="dialog" aria-labelledby="facebox-header" aria-describedby="facebox-description">
        </div>
        <button type="button" class="facebox-close js-facebox-close" aria-label="Close modal">
            <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12">
                <path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/>
            </svg>
        </button>
    </div>
</div>
</body>
</html>
<%-- login --%>