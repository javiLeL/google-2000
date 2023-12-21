package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        // System.out.println(etiquetaLinkExtractor("mas resto del html <a href=\"uwu\"> hola </a> el resto del html XD mamon <a href=\"soy un link\"> link :D </a> no te lo vas a creer aqui ya mas WOOOO"));
        // etiquetaLinkExtractor(htmlExtractor("https://es.wikipedia.org/wiki/Wiki")).stream().forEach(System.out::println);

        /*System.out.println(etiquetaLinkExtractor(Datos.htmlPrueva));

        for(int i=0;i<etiquetaLinkExtractor(Datos.htmlPrueva).size();i++){
            System.out.println(linkStractorElement(etiquetaLinkExtractor(Datos.htmlPrueva).get(i)));
        }*/

        // Extractor de links
        /*
        String enlace = "https://en.wikipedia.org/wiki/Box-drawing_character";
        for(int i=0;i<etiquetaLinkExtractor(htmlExtractor(enlace)).size();i++){
            String link, word = deleteEtiquetas(wordStractorElemet(etiquetaLinkExtractor(htmlExtractor(enlace)).get(i)));
            if((link=linkStractorElement(etiquetaLinkExtractor(htmlExtractor(enlace)).get(i)))!=null && word!=null){
                System.out.println(link+" --> "+word);
            }
        }
        */
        // Extractor de palabras
        /*
        for(int i=0;i<etiquetaLinkExtractor(Datos.htmlPrueva).size();i++){
            String link, word = deleteEtiquetas(wordStractorElemet(etiquetaLinkExtractor(Datos.htmlPrueva).get(i)));
            if((link=linkStractorElement(etiquetaLinkExtractor(Datos.htmlPrueva).get(i)))!=null){
                System.out.println(link +" </> "+ word);
            }
        }
        */
        // urlToListOfLinks("https://en.wikipedia.org/wiki/Box-drawing_character").stream().forEach(System.out::println);
        System.out.println(deleteEtiquetas("<body class=\"skin-vector skin-vector-search-vue mediawiki ltr sitedir-ltr mw-hide-empty-elt ns-0 ns-subject page-Main_Page rootpage-Main_Page skin-vector-2022 action-view uls-dialog-sticky-hide\"><a class=\"mw-jump-link\" href=\"#bodyContent\">Jump to content</a>\r\n" + //
                "<div class=\"vector-header-container\">\r\n" + //
                "\t<header class=\"vector-header mw-header\">\r\n" + //
                "\t\t<div class=\"vector-header-start\">\r\n" + //
                "\t\t\t<nav class=\"vector-main-menu-landmark\" aria-label=\"Site\" role=\"navigation\">\r\n" + //
                "\t\t\t\t\r\n" + //
                "<div id=\"vector-main-menu-dropdown\" class=\"vector-dropdown vector-main-menu-dropdown vector-button-flush-left vector-button-flush-right\">\r\n" + //
                "\t<input type=\"checkbox\" id=\"vector-main-menu-dropdown-checkbox\" role=\"button\" aria-haspopup=\"true\" data-event-name=\"ui.dropdown-vector-main-menu-dropdown\" class=\"vector-dropdown-checkbox \" aria-label=\"Main menu\">\r\n" + //
                "\t<label id=\"vector-main-menu-dropdown-label\" for=\"vector-main-menu-dropdown-checkbox\" class=\"vector-dropdown-label cdx-button cdx-button--fake-button cdx-button--fake-button--enabled cdx-button--weight-quiet cdx-button--icon-only \" aria-hidden=\"true\"><span class=\"vector-icon mw-ui-icon-menu mw-ui-icon-wikimedia-menu\"></span>\r\n" + //
                "\r\n" + //
                "<span class=\"vector-dropdown-label-text\">Main menu</span>\r\n" + //
                "\t</label>\r\n" + //
                "\t<div class=\"vector-dropdown-content\">\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\t\t\t\t<div id=\"vector-main-menu-unpinned-container\" class=\"vector-unpinned-container\">\r\n" + //
                "\t\t\r\n" + //
                "<div id=\"vector-main-menu\" class=\"vector-main-menu vector-pinnable-element\">\r\n" + //
                "\t<div class=\"vector-pinnable-header vector-main-menu-pinnable-header vector-pinnable-header-unpinned\" data-feature-name=\"main-menu-pinned\" data-pinnable-element-id=\"vector-main-menu\" data-pinned-container-id=\"vector-main-menu-pinned-container\" data-unpinned-container-id=\"vector-main-menu-unpinned-container\" data-saved-pinned-state=\"false\">\r\n" + //
                "\t<div class=\"vector-pinnable-header-label\">Main menu</div>\r\n" + //
                "\t<button class=\"vector-pinnable-header-toggle-button vector-pinnable-header-pin-button\" data-event-name=\"pinnable-header.vector-main-menu.pin\">move to sidebar</button>\r\n" + //
                "\t<button class=\"vector-pinnable-header-toggle-button vector-pinnable-header-unpin-button\" data-event-name=\"pinnable-header.vector-main-menu.unpin\">hide</button>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\r\n" + //
                "<div id=\"p-navigation\" class=\"vector-menu mw-portlet mw-portlet-navigation\">\r\n" + //
                "\t<div class=\"vector-menu-heading\">\r\n" + //
                "\t\tNavigation\r\n" + //
                "\t</div>\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"n-mainpage-description\" class=\"mw-list-item\"><a href=\"/wiki/Main_Page\" title=\"Visit the main page [Alt+Mayús.+z]\" accesskey=\"z\"><span>Main page</span></a></li><li id=\"n-contents\" class=\"mw-list-item\"><a href=\"/wiki/Wikipedia:Contents\" title=\"Guides to browsing Wikipedia\"><span>Contents</span></a></li><li id=\"n-currentevents\" class=\"mw-list-item\"><a href=\"/wiki/Portal:Current_events\" title=\"Articles related to current events\"><span>Current events</span></a></li><li id=\"n-randompage\" class=\"mw-list-item\"><a href=\"/wiki/Special:Random\" title=\"Visit a randomly selected article [Alt+Mayús.+x]\" accesskey=\"x\"><span>Random article</span></a></li><li id=\"n-aboutsite\" class=\"mw-list-item\"><a href=\"/wiki/Wikipedia:About\" title=\"Learn about Wikipedia and how it works\"><span>About Wikipedia</span></a></li><li id=\"n-contactpage\" class=\"mw-list-item\"><a href=\"//en.wikipedia.org/wiki/Wikipedia:Contact_us\" title=\"How to contact Wikipedia\"><span>Contact us</span></a></li><li id=\"n-sitesupport\" class=\"mw-list-item\"><a href=\"https://donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&amp;utm_medium=sidebar&amp;utm_campaign=C13_en.wikipedia.org&amp;uselang=en\" title=\"Support us by donating to the Wikimedia Foundation\"><span>Donate</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\r\n" + //
                "\t\r\n" + //
                "<div id=\"p-interaction\" class=\"vector-menu mw-portlet mw-portlet-interaction\">\r\n" + //
                "\t<div class=\"vector-menu-heading\">\r\n" + //
                "\t\tContribute\r\n" + //
                "\t</div>\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"n-help\" class=\"mw-list-item\"><a href=\"/wiki/Help:Contents\" title=\"Guidance on how to use and edit Wikipedia\"><span>Help</span></a></li><li id=\"n-introduction\" class=\"mw-list-item\"><a href=\"/wiki/Help:Introduction\" title=\"Learn how to edit Wikipedia\"><span>Learn to edit</span></a></li><li id=\"n-portal\" class=\"mw-list-item\"><a href=\"/wiki/Wikipedia:Community_portal\" title=\"The hub for editors\"><span>Community portal</span></a></li><li id=\"n-recentchanges\" class=\"mw-list-item\"><a href=\"/wiki/Special:RecentChanges\" title=\"A list of recent changes to Wikipedia [Alt+Mayús.+r]\" accesskey=\"r\"><span>Recent changes</span></a></li><li id=\"n-upload\" class=\"mw-list-item\"><a href=\"/wiki/Wikipedia:File_upload_wizard\" title=\"Add images or other media for use on Wikipedia\"><span>Upload file</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t</div>\r\n" + //
                "\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t</nav>\r\n" + //
                "\t\t\t\r\n" + //
                "<a href=\"/wiki/Main_Page\" class=\"mw-logo\">\r\n" + //
                "\t<img class=\"mw-logo-icon\" src=\"/static/images/icons/wikipedia.png\" alt=\"\" aria-hidden=\"true\" height=\"50\" width=\"50\">\r\n" + //
                "\t<span class=\"mw-logo-container\">\r\n" + //
                "\t\t<img class=\"mw-logo-wordmark\" alt=\"Wikipedia\" src=\"/static/images/mobile/copyright/wikipedia-wordmark-en.svg\" style=\"width: 7.5em; height: 1.125em;\">\r\n" + //
                "\t\t<img class=\"mw-logo-tagline\" alt=\"The Free Encyclopedia\" src=\"/static/images/mobile/copyright/wikipedia-tagline-en.svg\" width=\"117\" height=\"13\" style=\"width: 7.3125em; height: 0.8125em;\">\r\n" + //
                "\t</span>\r\n" + //
                "</a>\r\n" + //
                "\r\n" + //
                "\t\t</div>\r\n" + //
                "\t\t<div class=\"vector-header-end\">\r\n" + //
                "\t\t\t\r\n" + //
                "<div id=\"p-search\" role=\"search\" class=\"vector-search-box-vue  vector-search-box-collapses vector-search-box-show-thumbnail vector-search-box-auto-expand-width vector-search-box\">\r\n" + //
                "\t<a href=\"/wiki/Special:Search\" class=\"cdx-button cdx-button--fake-button cdx-button--fake-button--enabled cdx-button--weight-quiet cdx-button--icon-only search-toggle\" id=\"\" title=\"Search Wikipedia [Alt+Mayús.+f]\" accesskey=\"f\"><span class=\"vector-icon mw-ui-icon-search mw-ui-icon-wikimedia-search\"></span>\r\n" + //
                "\r\n" + //
                "<span>Search</span>\r\n" + //
                "\t</a>\r\n" + //
                "\t<div class=\"vector-typeahead-search-container\">\r\n" + //
                "\t\t<div class=\"cdx-typeahead-search cdx-typeahead-search--show-thumbnail cdx-typeahead-search--auto-expand-width\">\r\n" + //
                "\t\t\t<form action=\"/w/index.php\" id=\"searchform\" class=\"cdx-search-input cdx-search-input--has-end-button\">\r\n" + //
                "\t\t\t\t<div id=\"simpleSearch\" class=\"cdx-search-input__input-wrapper\" data-search-loc=\"header-moved\">\r\n" + //
                "\t\t\t\t\t<div class=\"cdx-text-input cdx-text-input--has-start-icon\">\r\n" + //
                "\t\t\t\t\t\t<input class=\"cdx-text-input__input\" type=\"search\" name=\"search\" placeholder=\"Search Wikipedia\" aria-label=\"Search Wikipedia\" autocapitalize=\"sentences\" title=\"Search Wikipedia [Alt+Mayús.+f]\" accesskey=\"f\" id=\"searchInput\" autocomplete=\"off\">\r\n" + //
                "\t\t\t\t\t\t<span class=\"cdx-text-input__icon cdx-text-input__start-icon\"></span>\r\n" + //
                "\t\t\t\t\t</div>\r\n" + //
                "\t\t\t\t\t<input type=\"hidden\" name=\"title\" value=\"Special:Search\">\r\n" + //
                "\t\t\t\t</div>\r\n" + //
                "\t\t\t\t<button class=\"cdx-button cdx-search-input__end-button\">Search</button>\r\n" + //
                "\t\t\t</form>\r\n" + //
                "\t\t</div>\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t<nav class=\"vector-user-links vector-user-links-wide\" aria-label=\"Personal tools\" role=\"navigation\">\r\n" + //
                "\t<div class=\"vector-user-links-main\">\r\n" + //
                "\t\r\n" + //
                "<div id=\"p-vector-user-menu-preferences\" class=\"vector-menu mw-portlet emptyPortlet\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\r\n" + //
                "<div id=\"p-vector-user-menu-userpage\" class=\"vector-menu mw-portlet emptyPortlet\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t<nav class=\"vector-client-prefs-landmark\" aria-label=\"Theme\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t\r\n" + //
                "\t</nav>\r\n" + //
                "\t\r\n" + //
                "<div id=\"p-vector-user-menu-notifications\" class=\"vector-menu mw-portlet emptyPortlet\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\r\n" + //
                "<div id=\"p-vector-user-menu-overflow\" class=\"vector-menu mw-portlet\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t<li id=\"pt-createaccount-2\" class=\"user-links-collapsible-item mw-list-item user-links-collapsible-item\"><a data-mw=\"interface\" href=\"/w/index.php?title=Special:CreateAccount&amp;returnto=Main+Page\" title=\"You are encouraged to create an account and log in; however, it is not mandatory\" class=\"\"><span>Create account</span></a>\r\n" + //
                "</li>\r\n" + //
                "<li id=\"pt-login-2\" class=\"user-links-collapsible-item mw-list-item user-links-collapsible-item\"><a data-mw=\"interface\" href=\"/w/index.php?title=Special:UserLogin&amp;returnto=Main+Page\" title=\"You're encouraged to log in; however, it's not mandatory. [Alt+Mayús.+o]\" accesskey=\"o\" class=\"\"><span>Log in</span></a>\r\n" + //
                "</li>\r\n" + //
                "\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t</div>\r\n" + //
                "\t\r\n" + //
                "<div id=\"vector-user-links-dropdown\" class=\"vector-dropdown vector-user-menu vector-button-flush-right vector-user-menu-logged-out\" title=\"Log in and more options\">\r\n" + //
                "\t<input type=\"checkbox\" id=\"vector-user-links-dropdown-checkbox\" role=\"button\" aria-haspopup=\"true\" data-event-name=\"ui.dropdown-vector-user-links-dropdown\" class=\"vector-dropdown-checkbox \" aria-label=\"Personal tools\">\r\n" + //
                "\t<label id=\"vector-user-links-dropdown-label\" for=\"vector-user-links-dropdown-checkbox\" class=\"vector-dropdown-label cdx-button cdx-button--fake-button cdx-button--fake-button--enabled cdx-button--weight-quiet cdx-button--icon-only \" aria-hidden=\"true\"><span class=\"vector-icon mw-ui-icon-ellipsis mw-ui-icon-wikimedia-ellipsis\"></span>\r\n" + //
                "\r\n" + //
                "<span class=\"vector-dropdown-label-text\">Personal tools</span>\r\n" + //
                "\t</label>\r\n" + //
                "\t<div class=\"vector-dropdown-content\">\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\t\t\r\n" + //
                "<div id=\"p-personal\" class=\"vector-menu mw-portlet mw-portlet-personal user-links-collapsible-item\" title=\"User menu\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"pt-createaccount\" class=\"user-links-collapsible-item mw-list-item\"><a href=\"/w/index.php?title=Special:CreateAccount&amp;returnto=Main+Page\" title=\"You are encouraged to create an account and log in; however, it is not mandatory\"><span class=\"vector-icon mw-ui-icon-userAdd mw-ui-icon-wikimedia-userAdd\"></span> <span>Create account</span></a></li><li id=\"pt-login\" class=\"user-links-collapsible-item mw-list-item\"><a href=\"/w/index.php?title=Special:UserLogin&amp;returnto=Main+Page\" title=\"You're encouraged to log in; however, it's not mandatory. [Alt+Mayús.+o]\" accesskey=\"o\"><span class=\"vector-icon mw-ui-icon-logIn mw-ui-icon-wikimedia-logIn\"></span> <span>Log in</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "<div id=\"p-user-menu-anon-editor\" class=\"vector-menu mw-portlet mw-portlet-user-menu-anon-editor\">\r\n" + //
                "\t<div class=\"vector-menu-heading\">\r\n" + //
                "\t\tPages for logged out editors <a href=\"/wiki/Help:Introduction\" aria-label=\"Learn more about editing\"><span>learn more</span></a>\r\n" + //
                "\t</div>\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"pt-anoncontribs\" class=\"mw-list-item\"><a href=\"/wiki/Special:MyContributions\" title=\"A list of edits made from this IP address [Alt+Mayús.+y]\" accesskey=\"y\"><span>Contributions</span></a></li><li id=\"pt-anontalk\" class=\"mw-list-item\"><a href=\"/wiki/Special:MyTalk\" title=\"Discussion about edits from this IP address [Alt+Mayús.+n]\" accesskey=\"n\"><span>Talk</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "</nav>\r\n" + //
                "\r\n" + //
                "\t\t</div>\r\n" + //
                "\t</header>\r\n" + //
                "</div>\r\n" + //
                "<div class=\"mw-page-container\">\r\n" + //
                "\t<div class=\"mw-page-container-inner\">\r\n" + //
                "\t\t<div class=\"vector-sitenotice-container\">\r\n" + //
                "\t\t\t<div id=\"siteNotice\"><div id=\"centralNotice\"></div><!-- CentralNotice --></div>\r\n" + //
                "\t\t</div>\r\n" + //
                "\t\t<div class=\"vector-column-start\">\r\n" + //
                "\t\t\t<div class=\"vector-main-menu-container\">\r\n" + //
                "\t\t<div id=\"mw-navigation\">\r\n" + //
                "\t\t\t<nav id=\"mw-panel\" class=\"vector-main-menu-landmark\" aria-label=\"Site\" role=\"navigation\">\r\n" + //
                "\t\t\t\t<div id=\"vector-main-menu-pinned-container\" class=\"vector-pinned-container\">\r\n" + //
                "\t\t\t\t\r\n" + //
                "\t\t\t\t</div>\r\n" + //
                "\t\t</nav>\r\n" + //
                "\t\t</div>\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\t\t<div class=\"mw-content-container\">\r\n" + //
                "\t\t\t<main id=\"content\" class=\"mw-body\" role=\"main\">\r\n" + //
                "\t\t\t\t<header class=\"mw-body-header vector-page-titlebar vector-page-titlebar-blank\">\r\n" + //
                "\t\t\t\t\t<h1 id=\"firstHeading\" class=\"firstHeading mw-first-heading\" style=\"display: none\"><span class=\"mw-page-title-main\">Main Page</span></h1>\r\n" + //
                "\t\t\t\t\t\t<div class=\"mw-indicators\">\r\n" + //
                "\t\t</div>\r\n" + //
                "</header>\r\n" + //
                "\t\t\t\t<div class=\"vector-page-toolbar\">\r\n" + //
                "\t\t\t\t\t<div class=\"vector-page-toolbar-container\">\r\n" + //
                "\t\t\t\t\t\t<div id=\"left-navigation\">\r\n" + //
                "\t\t\t\t\t\t\t<nav aria-label=\"Namespaces\">\r\n" + //
                "\t\t\t\t\t\t\t\t\r\n" + //
                "<div id=\"p-associated-pages\" class=\"vector-menu vector-menu-tabs mw-portlet mw-portlet-associated-pages\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"ca-nstab-main\" class=\"selected vector-tab-noicon mw-list-item\"><a href=\"/wiki/Main_Page\" title=\"View the content page [Alt+Mayús.+c]\" accesskey=\"c\"><span>Main Page</span></a></li><li id=\"ca-talk\" class=\"vector-tab-noicon mw-list-item\"><a href=\"/wiki/Talk:Main_Page\" rel=\"discussion\" title=\"Discuss improvements to the content page [Alt+Mayús.+t]\" accesskey=\"t\"><span>Talk</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t\t\t\t\t\r\n" + //
                "<div id=\"p-variants\" class=\"vector-dropdown emptyPortlet\">\r\n" + //
                "\t<input type=\"checkbox\" id=\"p-variants-checkbox\" role=\"button\" aria-haspopup=\"true\" data-event-name=\"ui.dropdown-p-variants\" class=\"vector-dropdown-checkbox \" aria-label=\"Change language variant\">\r\n" + //
                "\t<label id=\"p-variants-label\" for=\"p-variants-checkbox\" class=\"vector-dropdown-label cdx-button cdx-button--fake-button cdx-button--fake-button--enabled cdx-button--weight-quiet\" aria-hidden=\"true\"><span class=\"vector-dropdown-label-text\">English</span>\r\n" + //
                "\t</label>\r\n" + //
                "\t<div class=\"vector-dropdown-content\">\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\t\t\t\t\t\r\n" + //
                "<div id=\"p-variants\" class=\"vector-menu mw-portlet mw-portlet-variants emptyPortlet\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t\t\t\t</nav>\r\n" + //
                "\t\t\t\t\t\t</div>\r\n" + //
                "\t\t\t\t\t\t<div id=\"right-navigation\" class=\"vector-collapsible\">\r\n" + //
                "\t\t\t\t\t\t\t<nav aria-label=\"Views\">\r\n" + //
                "\t\t\t\t\t\t\t\t\r\n" + //
                "<div id=\"p-views\" class=\"vector-menu vector-menu-tabs mw-portlet mw-portlet-views\">\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"ca-view\" class=\"selected vector-tab-noicon mw-list-item\"><a href=\"/wiki/Main_Page\"><span>Read</span></a></li><li id=\"ca-viewsource\" class=\"vector-tab-noicon mw-list-item\"><a href=\"/w/index.php?title=Main_Page&amp;action=edit\" title=\"This page is protected.\r\n" + //
                "You can view its source [Alt+Mayús.+e]\" accesskey=\"e\"><span>View source</span></a></li><li id=\"ca-history\" class=\"vector-tab-noicon mw-list-item\"><a href=\"/w/index.php?title=Main_Page&amp;action=history\" title=\"Past revisions of this page [Alt+Mayús.+h]\" accesskey=\"h\"><span>View history</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t\t\t\t</nav>\r\n" + //
                "\t\t\t\t\r\n" + //
                "\t\t\t\t\t\t\t<nav class=\"vector-page-tools-landmark\" aria-label=\"Page tools\">\r\n" + //
                "\t\t\t\t\t\t\t\t\r\n" + //
                "<div id=\"vector-page-tools-dropdown\" class=\"vector-dropdown vector-page-tools-dropdown\">\r\n" + //
                "\t<input type=\"checkbox\" id=\"vector-page-tools-dropdown-checkbox\" role=\"button\" aria-haspopup=\"true\" data-event-name=\"ui.dropdown-vector-page-tools-dropdown\" class=\"vector-dropdown-checkbox \" aria-label=\"Tools\">\r\n" + //
                "\t<label id=\"vector-page-tools-dropdown-label\" for=\"vector-page-tools-dropdown-checkbox\" class=\"vector-dropdown-label cdx-button cdx-button--fake-button cdx-button--fake-button--enabled cdx-button--weight-quiet\" aria-hidden=\"true\"><span class=\"vector-dropdown-label-text\">Tools</span>\r\n" + //
                "\t</label>\r\n" + //
                "\t<div class=\"vector-dropdown-content\">\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\t\t\t\t\t\t\t\t\t<div id=\"vector-page-tools-unpinned-container\" class=\"vector-unpinned-container\">\r\n" + //
                "\t\t\t\t\t\t\r\n" + //
                "<div id=\"vector-page-tools\" class=\"vector-page-tools vector-pinnable-element\">\r\n" + //
                "\t<div class=\"vector-pinnable-header vector-page-tools-pinnable-header vector-pinnable-header-unpinned\" data-feature-name=\"page-tools-pinned\" data-pinnable-element-id=\"vector-page-tools\" data-pinned-container-id=\"vector-page-tools-pinned-container\" data-unpinned-container-id=\"vector-page-tools-unpinned-container\" data-saved-pinned-state=\"false\">\r\n" + //
                "\t<div class=\"vector-pinnable-header-label\">Tools</div>\r\n" + //
                "\t<button class=\"vector-pinnable-header-toggle-button vector-pinnable-header-pin-button\" data-event-name=\"pinnable-header.vector-page-tools.pin\">move to sidebar</button>\r\n" + //
                "\t<button class=\"vector-pinnable-header-toggle-button vector-pinnable-header-unpin-button\" data-event-name=\"pinnable-header.vector-page-tools.unpin\">hide</button>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\r\n" + //
                "<div id=\"p-cactions\" class=\"vector-menu mw-portlet mw-portlet-cactions emptyPortlet vector-has-collapsible-items\" title=\"More options\">\r\n" + //
                "\t<div class=\"vector-menu-heading\">\r\n" + //
                "\t\tActions\r\n" + //
                "\t</div>\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"ca-more-view\" class=\"selected vector-more-collapsible-item mw-list-item\"><a href=\"/wiki/Main_Page\"><span>Read</span></a></li><li id=\"ca-more-viewsource\" class=\"vector-more-collapsible-item mw-list-item\"><a href=\"/w/index.php?title=Main_Page&amp;action=edit\"><span>View source</span></a></li><li id=\"ca-more-history\" class=\"vector-more-collapsible-item mw-list-item\"><a href=\"/w/index.php?title=Main_Page&amp;action=history\"><span>View history</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "<div id=\"p-tb\" class=\"vector-menu mw-portlet mw-portlet-tb\">\r\n" + //
                "\t<div class=\"vector-menu-heading\">\r\n" + //
                "\t\tGeneral\r\n" + //
                "\t</div>\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"t-whatlinkshere\" class=\"mw-list-item\"><a href=\"/wiki/Special:WhatLinksHere/Main_Page\" title=\"List of all English Wikipedia pages containing links to this page [Alt+Mayús.+j]\" accesskey=\"j\"><span>What links here</span></a></li><li id=\"t-recentchangeslinked\" class=\"mw-list-item\"><a href=\"/wiki/Special:RecentChangesLinked/Main_Page\" rel=\"nofollow\" title=\"Recent changes in pages linked from this page [Alt+Mayús.+k]\" accesskey=\"k\"><span>Related changes</span></a></li><li id=\"t-upload\" class=\"mw-list-item\"><a href=\"/wiki/Wikipedia:File_Upload_Wizard\" title=\"Upload files [Alt+Mayús.+u]\" accesskey=\"u\"><span>Upload file</span></a></li><li id=\"t-specialpages\" class=\"mw-list-item\"><a href=\"/wiki/Special:SpecialPages\" title=\"A list of all special pages [Alt+Mayús.+q]\" accesskey=\"q\"><span>Special pages</span></a></li><li id=\"t-permalink\" class=\"mw-list-item\"><a href=\"https://en.wikipedia.org/w/index.php?title=Main_Page&amp;oldid=1189617895\" title=\"Permanent link to this revision of this page\"><span>Permanent link</span></a></li><li id=\"t-info\" class=\"mw-list-item\"><a href=\"/w/index.php?title=Main_Page&amp;action=info\" title=\"More information about this page\"><span>Page information</span></a></li><li id=\"t-cite\" class=\"mw-list-item\"><a href=\"/w/index.php?title=Special:CiteThisPage&amp;page=Main_Page&amp;id=1189617895&amp;wpFormIdentifier=titleform\" title=\"Information on how to cite this page\"><span>Cite this page</span></a></li><li id=\"t-urlshortener\" class=\"mw-list-item\"><a href=\"/w/index.php?title=Special:UrlShortener&amp;url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FMain_Page\" aria-haspopup=\"dialog\"><span>Get shortened URL</span></a></li><li id=\"t-wikibase\" class=\"mw-list-item\"><a href=\"https://www.wikidata.org/wiki/Special:EntityPage/Q5296\" title=\"Structured data on this page hosted by Wikidata [Alt+Mayús.+g]\" accesskey=\"g\"><span>Wikidata item</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "<div id=\"p-coll-print_export\" class=\"vector-menu mw-portlet mw-portlet-coll-print_export\">\r\n" + //
                "\t<div class=\"vector-menu-heading\">\r\n" + //
                "\t\tPrint/export\r\n" + //
                "\t</div>\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li id=\"coll-download-as-rl\" class=\"mw-list-item\"><a href=\"/w/index.php?title=Special:DownloadAsPdf&amp;page=Main_Page&amp;action=show-download-screen\" title=\"Download this page as a PDF file\"><span>Download as PDF</span></a></li><li id=\"t-print\" class=\"mw-list-item\"><a href=\"/w/index.php?title=Main_Page&amp;printable=yes\" title=\"Printable version of this page [Alt+Mayús.+p]\" accesskey=\"p\"><span>Printable version</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "<div id=\"p-wikibase-otherprojects\" class=\"vector-menu mw-portlet mw-portlet-wikibase-otherprojects\">\r\n" + //
                "\t<div class=\"vector-menu-heading\">\r\n" + //
                "\t\tIn other projects\r\n" + //
                "\t</div>\r\n" + //
                "\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\r\n" + //
                "\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<li class=\"wb-otherproject-link wb-otherproject-commons mw-list-item\"><a href=\"https://commons.wikimedia.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikimedia Commons</span></a></li><li class=\"wb-otherproject-link wb-otherproject-foundation mw-list-item\"><a href=\"https://foundation.wikimedia.org/wiki/Home\" hreflang=\"en\"><span>Wikimedia Foundation</span></a></li><li class=\"wb-otherproject-link wb-otherproject-mediawiki mw-list-item\"><a href=\"https://www.mediawiki.org/wiki/MediaWiki\" hreflang=\"en\"><span>MediaWiki</span></a></li><li class=\"wb-otherproject-link wb-otherproject-meta mw-list-item\"><a href=\"https://meta.wikimedia.org/wiki/Main_Page\" hreflang=\"en\"><span>Meta-Wiki</span></a></li><li class=\"wb-otherproject-link wb-otherproject-outreach mw-list-item\"><a href=\"https://outreach.wikimedia.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikimedia Outreach</span></a></li><li class=\"wb-otherproject-link wb-otherproject-sources mw-list-item\"><a href=\"https://wikisource.org/wiki/Main_Page\" hreflang=\"en\"><span>Multilingual Wikisource</span></a></li><li class=\"wb-otherproject-link wb-otherproject-species mw-list-item\"><a href=\"https://species.wikimedia.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikispecies</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikibooks mw-list-item\"><a href=\"https://en.wikibooks.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikibooks</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikidata mw-list-item\"><a href=\"https://www.wikidata.org/wiki/Wikidata:Main_Page\" hreflang=\"en\"><span>Wikidata</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikifunctions mw-list-item\"><a href=\"https://www.wikifunctions.org/wiki/Wikifunctions:Main_Page\" hreflang=\"en\"><span>Wikifunctions</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikimania badge-Q70894304 mw-list-item\" title=\"\"><a href=\"https://wikimania.wikimedia.org/wiki/Wikimania\" hreflang=\"en\"><span>Wikimania</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikinews mw-list-item\"><a href=\"https://en.wikinews.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikinews</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikiquote mw-list-item\"><a href=\"https://en.wikiquote.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikiquote</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikisource mw-list-item\"><a href=\"https://en.wikisource.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikisource</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikiversity mw-list-item\"><a href=\"https://en.wikiversity.org/wiki/Wikiversity:Main_Page\" hreflang=\"en\"><span>Wikiversity</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wikivoyage mw-list-item\"><a href=\"https://en.wikivoyage.org/wiki/Main_Page\" hreflang=\"en\"><span>Wikivoyage</span></a></li><li class=\"wb-otherproject-link wb-otherproject-wiktionary mw-list-item\"><a href=\"https://en.wiktionary.org/wiki/Wiktionary:Main_Page\" hreflang=\"en\"><span>Wiktionary</span></a></li>\r\n" + //
                "\t\t</ul>\r\n" + //
                "\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t\t\t\t\t\t</div>\r\n" + //
                "\t\t\t\t\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t\t\t\t</nav>\r\n" + //
                "\t\t\t\t\t\t</div>\r\n" + //
                "\t\t\t\t\t</div>\r\n" + //
                "\t\t\t\t</div>\r\n" + //
                "\t\t\t\t<div class=\"vector-column-end\">\r\n" + //
                "\t\t\t\t\t<div class=\"vector-sticky-pinned-container\">\r\n" + //
                "\t\t\t\t\t\t<nav class=\"vector-page-tools-landmark\" aria-label=\"Page tools\">\r\n" + //
                "\t\t\t\t\t\t\t<div id=\"vector-page-tools-pinned-container\" class=\"vector-pinned-container\">\r\n" + //
                "\t\t\t\t\r\n" + //
                "\t\t\t\t\t\t\t</div>\r\n" + //
                "\t\t</nav>\r\n" + //
                "\t\t\t\t\t\t<nav class=\"vector-client-prefs-landmark\" aria-label=\"Theme\">\r\n" + //
                "\t\t\t\t\t\t</nav>\r\n" + //
                "\t\t\t\t\t</div>\r\n" + //
                "\t\t\t\t</div>\r\n" + //
                "\t\t\t\t<div id=\"bodyContent\" class=\"vector-body ve-init-mw-desktopArticleTarget-targetContainer\" aria-labelledby=\"firstHeading\" data-mw-ve-target-container=\"\">\r\n" + //
                "\t\t\t\t\t<div class=\"vector-body-before-content\">\r\n" + //
                "\t\t\t\t\t\r\n" + //
                "\t\t\t\t\t\t<div id=\"siteSub\" class=\"noprint\">From Wikipedia, the free encyclopedia</div>\r\n" + //
                "\t\t\t\t\t</div>\r\n" + //
                "\t\t\t\t\t<div id=\"contentSub\"><div id=\"mw-content-subtitle\"></div></div>\r\n" + //
                "\t\t\t\t\t\r\n" + //
                "\t\t\t\t\t\r\n" + //
                "\t\t\t\t\t<div id=\"mw-content-text\" class=\"mw-body-content\"><div class=\"mw-content-ltr mw-parser-output\" lang=\"en\" dir=\"ltr\"><style data-mw-deduplicate=\"TemplateStyles:r1131603205\">.mw-parser-output .mp-box{border:1px solid #aaa;padding:0 0.5em 0.5em;margin-top:4px}.mw-parser-output .mp-h2,body.skin-timeless .mw-parser-output .mp-h2{border:1px solid #aaa;margin:0.5em 0;padding:0.2em 0.4em;font-size:120%;font-weight:bold;font-family:inherit}.mw-parser-output .mp-later{font-size:85%;font-weight:normal}.mw-parser-output #mp-topbanner{background:#f9f9f9;border-color:#ddd}.mw-parser-output #mp-welcomecount{text-align:center;margin:0.4em}.mw-parser-output #mp-welcome{font-size:162%;padding:0.1em}.mw-parser-output #mp-welcome h1{font-size:inherit;font-family:inherit;display:inline;border:none}.mw-parser-output #mp-free{font-size:95%}.mw-parser-output #articlecount{font-size:85%}.mw-parser-output .mp-contains-float::after{content:\"\";display:block;clear:both}.mw-parser-output #mp-banner{background:#fffaf5;border-color:#f2e0ce}.mw-parser-output #mp-left{background:#f5fffa;border-color:#cef2e0}.mw-parser-output #mp-left .mp-h2{background:#cef2e0;border-color:#a3bfb1}.mw-parser-output #mp-right{background:#f5faff;border-color:#cedff2}.mw-parser-output #mp-right .mp-h2{background:#cedff2;border-color:#a3b0bf}.mw-parser-output #mp-middle{background:#fff5fa;border-color:#f2cedd}.mw-parser-output #mp-middle .mp-h2{background:#f2cedd;border-color:#bfa3af}.mw-parser-output #mp-lower{background:#faf5ff;border-color:#ddcef2}.mw-parser-output #mp-lower .mp-h2{background:#ddcef2;border-color:#afa3bf}.mw-parser-output #mp-bottom{border-color:#e2e2e2}.mw-parser-output #mp-bottom .mp-h2{background:#eee;border-color:#ddd}@media(max-width:875px){.mw-parser-output #mp-tfp table,.mw-parser-output #mp-tfp tr,.mw-parser-output #mp-tfp td,.mw-parser-output #mp-tfp tbody{display:block!important;width:100%!important;box-sizing:border-box}.mw-parser-output #mp-tfp tr:first-child td:first-child a{text-align:center;display:table;margin:0 auto}}@media(min-width:875px){.mw-parser-output #mp-upper{display:flex}.mw-parser-output #mp-left{flex:1 1 55%;margin-right:2px}.mw-parser-output #mp-right{flex:1 1 45%;margin-left:2px}}</style><style class=\"darkreader darkreader--sync\" media=\"screen\"></style>\r\n" + //
                "<div id=\"mp-topbanner\" class=\"mp-box\">\r\n" + //
                "<div id=\"mp-welcomecount\">\r\n" + //
                "<div id=\"mp-welcome\"><h1><span class=\"mw-headline\" id=\"Welcome_to_Wikipedia\">Welcome to <a href=\"/wiki/Wikipedia\" title=\"Wikipedia\">Wikipedia</a></span></h1>,</div>\r\n" + //
                "<div id=\"mp-free\">the <a href=\"/wiki/Free_content\" title=\"Free content\">free</a> <a href=\"/wiki/Encyclopedia\" title=\"Encyclopedia\">encyclopedia</a> that <a href=\"/wiki/Help:Introduction_to_Wikipedia\" title=\"Help:Introduction to Wikipedia\">anyone can edit</a>.</div>\r\n" + //
                "<div id=\"articlecount\"><a href=\"/wiki/Special:Statistics\" title=\"Special:Statistics\">6,760,012</a> articles in <a href=\"/wiki/English_language\" title=\"English language\">English</a></div>\r\n" + //
                "</div>\r\n" + //
                "</div>\r\n" + //
                "<div id=\"mp-upper\">\r\n" + //
                "<div id=\"mp-left\" class=\"MainPageBG mp-box\">\r\n" + //
                "<h2 id=\"mp-tfa-h2\" class=\"mp-h2\"><span id=\"From_today.27s_featured_article\"></span><span class=\"mw-headline\" id=\"From_today's_featured_article\">From today's featured article</span></h2>\r\n" + //
                "<div id=\"mp-tfa\" class=\"mp-contains-float\"><div id=\"mp-tfa-img\" style=\"float: left; margin: 0.5em 0.9em 0.4em 0em;\">\r\n" + //
                "<div class=\"thumbinner mp-thumb\" style=\"background: transparent; border: medium; padding: 0px; max-width: 168px; --darkreader-inline-bgcolor: transparent; --darkreader-inline-bgimage: none; --darkreader-inline-border-top: currentcolor; --darkreader-inline-border-right: currentcolor; --darkreader-inline-border-bottom: currentcolor; --darkreader-inline-border-left: currentcolor;\" data-darkreader-inline-bgcolor=\"\" data-darkreader-inline-bgimage=\"\" data-darkreader-inline-border-top=\"\" data-darkreader-inline-border-right=\"\" data-darkreader-inline-border-bottom=\"\" data-darkreader-inline-border-left=\"\">\r\n" + //
                "<span typeof=\"mw:File\"><a href=\"/wiki/File:1953_11_if_kenfagg.jpg\" class=\"mw-file-description\" title=\"1953 magazine cover, &quot;Surveying a Dying Sun&quot;\"><img alt=\"1953 magazine cover, &quot;Surveying a Dying Sun&quot;\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/5/55/1953_11_if_kenfagg.jpg/168px-1953_11_if_kenfagg.jpg\" decoding=\"async\" width=\"168\" height=\"116\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/5/55/1953_11_if_kenfagg.jpg/252px-1953_11_if_kenfagg.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/5/55/1953_11_if_kenfagg.jpg/336px-1953_11_if_kenfagg.jpg 2x\" data-file-width=\"1500\" data-file-height=\"1040\"></a></span><div class=\"thumbcaption\" style=\"padding: 0.25em 0; word-wrap: break-word;\">1953 magazine cover, \"Surveying a Dying Sun\"</div></div>\r\n" + //
                "</div>\r\n" + //
                "<p>The <b><a href=\"/wiki/Sun_in_fiction\" title=\"Sun in fiction\">Sun has appeared in fiction</a></b> since <a href=\"/wiki/Classical_antiquity\" title=\"Classical antiquity\">classical antiquity</a>, but for a long time it rarely received attention. Many of the early depictions viewed the <a href=\"/wiki/Sun\" title=\"Sun\">Sun</a> as essentially <a href=\"/wiki/Earth_analog\" title=\"Earth analog\">Earth-like</a> and potentially <a href=\"/wiki/Planetary_habitability\" title=\"Planetary habitability\">habitable</a>—a once-common belief about <a href=\"/wiki/Astronomical_object\" title=\"Astronomical object\">celestial objects</a> in general known as the <a href=\"/wiki/Cosmic_pluralism\" title=\"Cosmic pluralism\">plurality of worlds</a>—and depicted various kinds of solar inhabitants. As more became known about the Sun through advances in <a href=\"/wiki/Astronomy\" title=\"Astronomy\">astronomy</a>, in particular its temperature, fewer solar lifeforms were depicted. Instead, many stories focused on the death of the Sun, either by going out or going <a href=\"/wiki/Nova\" title=\"Nova\">nova</a>, and the ensuing havoc on Earth. Less disastrously, <a href=\"/wiki/Solar_flare\" title=\"Solar flare\">solar flares</a> and <a href=\"/wiki/Solar_eclipse\" title=\"Solar eclipse\">eclipses</a> have also been depicted. The Sun has been portrayed as a source of power—both in the form of <a href=\"/wiki/Solar_power\" title=\"Solar power\">solar power</a> and <a href=\"/wiki/Superpower_(ability)\" title=\"Superpower (ability)\">superpower abilities</a>. It poses a danger to spacecraft that approach it, which occurs in several stories. Overall, the Sun remains relatively uncommon as a point of focus in <a href=\"/wiki/Science_fiction\" title=\"Science fiction\">science fiction</a>, particularly in comparison to <a href=\"/wiki/Mars_in_fiction\" title=\"Mars in fiction\">depictions of Mars</a> and <a href=\"/wiki/Venus_in_fiction\" title=\"Venus in fiction\">Venus</a>. (<b><a href=\"/wiki/Sun_in_fiction\" title=\"Sun in fiction\">Full&nbsp;article...</a></b>)\r\n" + //
                "</p>\r\n" + //
                "<div class=\"tfa-recent\" style=\"text-align: right;\">\r\n" + //
                "Recently featured: <style data-mw-deduplicate=\"TemplateStyles:r1129693374\">.mw-parser-output .hlist dl,.mw-parser-output .hlist ol,.mw-parser-output .hlist ul{margin:0;padding:0}.mw-parser-output .hlist dd,.mw-parser-output .hlist dt,.mw-parser-output .hlist li{margin:0;display:inline}.mw-parser-output .hlist.inline,.mw-parser-output .hlist.inline dl,.mw-parser-output .hlist.inline ol,.mw-parser-output .hlist.inline ul,.mw-parser-output .hlist dl dl,.mw-parser-output .hlist dl ol,.mw-parser-output .hlist dl ul,.mw-parser-output .hlist ol dl,.mw-parser-output .hlist ol ol,.mw-parser-output .hlist ol ul,.mw-parser-output .hlist ul dl,.mw-parser-output .hlist ul ol,.mw-parser-output .hlist ul ul{display:inline}.mw-parser-output .hlist .mw-empty-li{display:none}.mw-parser-output .hlist dt::after{content:\": \"}.mw-parser-output .hlist dd::after,.mw-parser-output .hlist li::after{content:\" · \";font-weight:bold}.mw-parser-output .hlist dd:last-child::after,.mw-parser-output .hlist dt:last-child::after,.mw-parser-output .hlist li:last-child::after{content:none}.mw-parser-output .hlist dd dd:first-child::before,.mw-parser-output .hlist dd dt:first-child::before,.mw-parser-output .hlist dd li:first-child::before,.mw-parser-output .hlist dt dd:first-child::before,.mw-parser-output .hlist dt dt:first-child::before,.mw-parser-output .hlist dt li:first-child::before,.mw-parser-output .hlist li dd:first-child::before,.mw-parser-output .hlist li dt:first-child::before,.mw-parser-output .hlist li li:first-child::before{content:\" (\";font-weight:normal}.mw-parser-output .hlist dd dd:last-child::after,.mw-parser-output .hlist dd dt:last-child::after,.mw-parser-output .hlist dd li:last-child::after,.mw-parser-output .hlist dt dd:last-child::after,.mw-parser-output .hlist dt dt:last-child::after,.mw-parser-output .hlist dt li:last-child::after,.mw-parser-output .hlist li dd:last-child::after,.mw-parser-output .hlist li dt:last-child::after,.mw-parser-output .hlist li li:last-child::after{content:\")\";font-weight:normal}.mw-parser-output .hlist ol{counter-reset:listitem}.mw-parser-output .hlist ol>li{counter-increment:listitem}.mw-parser-output .hlist ol>li::before{content:\" \"counter(listitem)\"\\a0 \"}.mw-parser-output .hlist dd ol>li:first-child::before,.mw-parser-output .hlist dt ol>li:first-child::before,.mw-parser-output .hlist li ol>li:first-child::before{content:\" (\"counter(listitem)\"\\a0 \"}</style><style class=\"darkreader darkreader--sync\" media=\"screen\"></style><div class=\"hlist inline\">\r\n" + //
                "<ul><li><a href=\"/wiki/Tolui\" title=\"Tolui\">Tolui</a></li>\r\n" + //
                "<li><a href=\"/wiki/C._O._Brocato\" title=\"C. O. Brocato\">C.&nbsp;O. Brocato</a></li>\r\n" + //
                "<li><i><a href=\"/wiki/Not_My_Responsibility\" title=\"Not My Responsibility\">Not My Responsibility</a></i></li></ul>\r\n" + //
                "</div></div>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist tfa-footer noprint\" style=\"text-align:right;\">\r\n" + //
                "<ul><li><b><a href=\"/wiki/Wikipedia:Today%27s_featured_article/December_2023\" title=\"Wikipedia:Today's featured article/December 2023\">Archive</a></b></li>\r\n" + //
                "<li><b><a href=\"https://lists.wikimedia.org/postorius/lists/daily-article-l.lists.wikimedia.org/\" class=\"extiw\" title=\"mail:daily-article-l\">By email</a></b></li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:Featured_articles\" title=\"Wikipedia:Featured articles\">More featured articles</a></b></li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:About_Today%27s_featured_article\" title=\"Wikipedia:About Today's featured article\">About</a></b></li></ul>\r\n" + //
                "</div></div>\r\n" + //
                "<h2 id=\"mp-dyk-h2\" class=\"mp-h2\"><span class=\"mw-headline\" id=\"Did_you_know_...\">Did you know&nbsp;...</span></h2>\r\n" + //
                "<div id=\"mp-dyk\" class=\"mp-contains-float\">\r\n" + //
                "<div class=\"dyk-img\" style=\"float: right; margin-left: 0.5em;\">\r\n" + //
                "<div class=\"thumbinner mp-thumb\" style=\"background: transparent; border: medium; padding: 0px; max-width: 140px; --darkreader-inline-bgcolor: transparent; --darkreader-inline-bgimage: none; --darkreader-inline-border-top: currentcolor; --darkreader-inline-border-right: currentcolor; --darkreader-inline-border-bottom: currentcolor; --darkreader-inline-border-left: currentcolor;\" data-darkreader-inline-bgcolor=\"\" data-darkreader-inline-bgimage=\"\" data-darkreader-inline-border-top=\"\" data-darkreader-inline-border-right=\"\" data-darkreader-inline-border-bottom=\"\" data-darkreader-inline-border-left=\"\">\r\n" + //
                "<span typeof=\"mw:File\"><a href=\"/wiki/File:Secretary_Blinken_performs_during_the_Global_Music_Diplomacy_Initiative_Launch_(53220710805)_(crop).jpg\" class=\"mw-file-description\" title=\"Blinken performing at the Global Music Diplomacy Initiative\"><img alt=\"Blinken performing at the Global Music Diplomacy Initiative\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Secretary_Blinken_performs_during_the_Global_Music_Diplomacy_Initiative_Launch_%2853220710805%29_%28crop%29.jpg/140px-Secretary_Blinken_performs_during_the_Global_Music_Diplomacy_Initiative_Launch_%2853220710805%29_%28crop%29.jpg\" decoding=\"async\" width=\"140\" height=\"140\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Secretary_Blinken_performs_during_the_Global_Music_Diplomacy_Initiative_Launch_%2853220710805%29_%28crop%29.jpg/210px-Secretary_Blinken_performs_during_the_Global_Music_Diplomacy_Initiative_Launch_%2853220710805%29_%28crop%29.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Secretary_Blinken_performs_during_the_Global_Music_Diplomacy_Initiative_Launch_%2853220710805%29_%28crop%29.jpg/280px-Secretary_Blinken_performs_during_the_Global_Music_Diplomacy_Initiative_Launch_%2853220710805%29_%28crop%29.jpg 2x\" data-file-width=\"5171\" data-file-height=\"5154\"></a></span><div class=\"thumbcaption\" style=\"padding: 0.25em 0; word-wrap: break-word;\">Blinken performing at the Global Music Diplomacy Initiative</div></div>\r\n" + //
                "</div>\r\n" + //
                "<ul><li>... that a video of U.S. Secretary of State Antony Blinken performing \"<a href=\"/wiki/Hoochie_Coochie_Man\" title=\"Hoochie Coochie Man\">Hoochie Coochie Man</a>\" at the September&nbsp;2023 launch of the <b><a href=\"/wiki/Global_Music_Diplomacy_Initiative\" title=\"Global Music Diplomacy Initiative\">Global Music Diplomacy Initiative</a></b> <i>(pictured)</i> went viral?</li>\r\n" + //
                "<li>... that the pastor <b><a href=\"/wiki/John_Littlejohn_(preacher)\" title=\"John Littlejohn (preacher)\">John Littlejohn</a></b> went from selling pornographic literature to sailors as a youth to protecting the Declaration of Independence?</li>\r\n" + //
                "<li>... that the restaurant <b><a href=\"/wiki/CosMc%27s\" title=\"CosMc's\">CosMc's</a></b> is named after a character from <a href=\"/wiki/McDonaldland\" title=\"McDonaldland\">McDonaldland</a>?</li>\r\n" + //
                "<li>... that <b><a href=\"/wiki/Nivelon_de_Quierzy\" title=\"Nivelon de Quierzy\">Nivelon de Quierzy</a></b> claimed to have brought the <a href=\"/wiki/Staff_of_Moses\" title=\"Staff of Moses\">staff of Moses</a> to France?</li>\r\n" + //
                "<li>... that <b><a href=\"/wiki/Misti\" title=\"Misti\">Misti</a></b> is one of the most dangerous volcanoes in the world?</li>\r\n" + //
                "<li>... that <b><a href=\"/wiki/Ho%C3%A0ng_Th%E1%BB%8B_Minh_H%E1%BB%93ng\" title=\"Hoàng Thị Minh Hồng\">Hoàng Thị Minh Hồng</a></b><span class=\"nowrap\">'s</span> environmental activism inspired <a href=\"/wiki/Barack_Obama\" title=\"Barack Obama\">Barack Obama</a>?</li>\r\n" + //
                "<li>... that <i><b><a href=\"/wiki/The_Story_Teller_(painting)\" title=\"The Story Teller (painting)\">The Story Teller</a></b></i> by <a href=\"/wiki/Amrita_Sher-Gil\" title=\"Amrita Sher-Gil\">Amrita Sher-Gil</a>, depicting a group of Indian village women performing ordinary tasks, fetched US$7.45&nbsp;million at auction in 2023?</li>\r\n" + //
                "<li>... that the Antarctic lichen <i><b><a href=\"/wiki/Buellia_frigida\" title=\"Buellia frigida\">Buellia frigida</a></b></i> has been to outer space?</li></ul>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist dyk-footer noprint\" style=\"margin-top: 0.5em; text-align: right;\">\r\n" + //
                "<ul><li><b><a href=\"/wiki/Wikipedia:Recent_additions\" title=\"Wikipedia:Recent additions\">Archive</a></b></li>\r\n" + //
                "<li><b><a href=\"/wiki/Help:Your_first_article\" title=\"Help:Your first article\">Start a new article</a></b></li>\r\n" + //
                "<li><b><a href=\"/wiki/Template_talk:Did_you_know\" title=\"Template talk:Did you know\">Nominate an article</a></b></li></ul>\r\n" + //
                "</div>\r\n" + //
                "</div>\r\n" + //
                "</div>\r\n" + //
                "<div id=\"mp-right\" class=\"MainPageBG mp-box\">\r\n" + //
                "<h2 id=\"mp-itn-h2\" class=\"mp-h2\"><span class=\"mw-headline\" id=\"In_the_news\">In the news</span></h2>\r\n" + //
                "<div id=\"mp-itn\" class=\"mp-contains-float\"><style data-mw-deduplicate=\"TemplateStyles:r1053378754\">.mw-parser-output .itn-img{float:right;margin-left:0.5em;margin-top:0.2em}</style><style class=\"darkreader darkreader--sync\" media=\"screen\"></style><div role=\"figure\" class=\"itn-img\">\r\n" + //
                "<div class=\"thumbinner mp-thumb\" style=\"background: transparent; border: medium; padding: 0px; max-width: 187px; --darkreader-inline-bgcolor: transparent; --darkreader-inline-bgimage: none; --darkreader-inline-border-top: currentcolor; --darkreader-inline-border-right: currentcolor; --darkreader-inline-border-bottom: currentcolor; --darkreader-inline-border-left: currentcolor;\" data-darkreader-inline-bgcolor=\"\" data-darkreader-inline-bgimage=\"\" data-darkreader-inline-border-top=\"\" data-darkreader-inline-border-right=\"\" data-darkreader-inline-border-bottom=\"\" data-darkreader-inline-border-left=\"\">\r\n" + //
                "<span typeof=\"mw:File\"><a href=\"/wiki/File:2023_Grindavik_eruption.jpg\" class=\"mw-file-description\" title=\"Grindavík eruption\"><img alt=\"Grindavík eruption\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/a/ac/2023_Grindavik_eruption.jpg/187px-2023_Grindavik_eruption.jpg\" decoding=\"async\" width=\"187\" height=\"105\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/a/ac/2023_Grindavik_eruption.jpg/281px-2023_Grindavik_eruption.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/a/ac/2023_Grindavik_eruption.jpg/374px-2023_Grindavik_eruption.jpg 2x\" data-file-width=\"4500\" data-file-height=\"2534\"></a></span><div class=\"thumbcaption\" style=\"padding: 0.25em 0; word-wrap: break-word; text-align: left;\">Grindavík eruption</div></div>\r\n" + //
                "</div>\r\n" + //
                "<ul><li>After weeks of earthquakes, <b><a href=\"/wiki/2023_Iceland_earthquakes\" title=\"2023 Iceland earthquakes\">a volcanic eruption</a></b> <i>(pictured)</i> occurs at Sundhnúka near  <a href=\"/wiki/Grindav%C3%ADk\" title=\"Grindavík\">Grindavík</a>, Iceland.</li>\r\n" + //
                "<li><b><a href=\"/wiki/2023_Jishishan_earthquake\" title=\"2023 Jishishan earthquake\">An earthquake</a></b> in <a href=\"/wiki/Jishishan_Bonan,_Dongxiang_and_Salar_Autonomous_County\" title=\"Jishishan Bonan, Dongxiang and Salar Autonomous County\">Jishishan County</a>, China, leaves more than 120 people dead.</li>\r\n" + //
                "<li>In <b><a href=\"/wiki/2023_Serbian_parliamentary_election\" title=\"2023 Serbian parliamentary election\">the parliamentary election</a></b>, the <a href=\"/wiki/Serbian_Progressive_Party\" title=\"Serbian Progressive Party\">Serbian Progressive Party</a> regains its <a href=\"/wiki/Majority_government\" title=\"Majority government\">parliamentary majority</a> in the <a href=\"/wiki/National_Assembly_(Serbia)\" title=\"National Assembly (Serbia)\">National Assembly</a>.</li>\r\n" + //
                "<li><b><a href=\"/wiki/Mishal_Al-Ahmad_Al-Jaber_Al-Sabah\" title=\"Mishal Al-Ahmad Al-Jaber Al-Sabah\">Mishal Al-Ahmad Al-Jaber Al-Sabah</a></b> becomes <a href=\"/wiki/Emir_of_Kuwait\" title=\"Emir of Kuwait\">Emir of Kuwait</a> after the death of his half-brother, <a href=\"/wiki/Nawaf_Al-Ahmad_Al-Jaber_Al-Sabah\" title=\"Nawaf Al-Ahmad Al-Jaber Al-Sabah\">Nawaf</a>.</li>\r\n" + //
                "<li>The <b><a href=\"/wiki/2023_United_Nations_Climate_Change_Conference\" title=\"2023 United Nations Climate Change Conference\">COP28</a></b> climate change summit ends with a call to transition away from the use of <a href=\"/wiki/Fossil_fuel\" title=\"Fossil fuel\">fossil fuels</a>.</li></ul>\r\n" + //
                "<div class=\"itn-footer\" style=\"margin-top: 0.5em;\">\r\n" + //
                "<div><b><a href=\"/wiki/Portal:Current_events\" title=\"Portal:Current events\">Ongoing</a></b>: <link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist inline\">\r\n" + //
                "<ul><li><a href=\"/wiki/2023_Israel%E2%80%93Hamas_war\" title=\"2023 Israel–Hamas war\">Israel–Hamas war</a></li>\r\n" + //
                "<li><a href=\"/wiki/Myanmar_civil_war_(2021%E2%80%93present)\" title=\"Myanmar civil war (2021–present)\">Myanmar civil war</a></li>\r\n" + //
                "<li><a href=\"/wiki/Russian_invasion_of_Ukraine\" title=\"Russian invasion of Ukraine\">Russian invasion of Ukraine</a>\r\n" + //
                "<ul><li><a href=\"/wiki/Timeline_of_the_Russian_invasion_of_Ukraine_(1_September_2023_%E2%80%93_present)\" title=\"Timeline of the Russian invasion of Ukraine (1 September 2023 – present)\">timeline</a></li></ul></li>\r\n" + //
                "<li><a href=\"/wiki/War_in_Sudan_(2023)\" title=\"War in Sudan (2023)\">War in Sudan</a></li></ul></div></div>\r\n" + //
                "<div><b><a href=\"/wiki/Deaths_in_2023\" title=\"Deaths in 2023\">Recent deaths</a></b>: <link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist inline\">\r\n" + //
                "<ul><li><a href=\"/wiki/Steve_Halliwell\" title=\"Steve Halliwell\">Steve Halliwell</a></li>\r\n" + //
                "<li><a href=\"/wiki/Otar_Iosseliani\" title=\"Otar Iosseliani\">Otar Iosseliani</a></li>\r\n" + //
                "<li><a href=\"/wiki/Richard_Hunt_(sculptor)\" title=\"Richard Hunt (sculptor)\">Richard Hunt</a></li>\r\n" + //
                "<li><a href=\"/wiki/Eric_Montross\" title=\"Eric Montross\">Eric Montross</a></li>\r\n" + //
                "<li><a href=\"/wiki/Antonio_Negri\" title=\"Antonio Negri\">Antonio Negri</a></li>\r\n" + //
                "<li><a href=\"/wiki/Amerigo_Thod%C3%A9\" title=\"Amerigo Thodé\">Amerigo Thodé</a></li></ul></div></div></div>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist itn-footer noprint\" style=\"text-align:right;\">\r\n" + //
                "<ul><li><b><a href=\"/wiki/Wikipedia:In_the_news/Candidates\" title=\"Wikipedia:In the news/Candidates\">Nominate an article</a></b></li></ul>\r\n" + //
                "</div></div>\r\n" + //
                "<h2 id=\"mp-otd-h2\" class=\"mp-h2\"><span class=\"mw-headline\" id=\"On_this_day\">On this day</span></h2>\r\n" + //
                "<div id=\"mp-otd\" class=\"mp-contains-float\">\r\n" + //
                "<p><b><a href=\"/wiki/December_21\" title=\"December 21\">December 21</a></b>\r\n" + //
                "</p>\r\n" + //
                "<div style=\"float:right;margin-left:0.5em;\" id=\"mp-otd-img\">\r\n" + //
                "<div class=\"thumbinner mp-thumb\" style=\"background: transparent; border: medium; padding: 0px; max-width: 162px; --darkreader-inline-bgcolor: transparent; --darkreader-inline-bgimage: none; --darkreader-inline-border-top: currentcolor; --darkreader-inline-border-right: currentcolor; --darkreader-inline-border-bottom: currentcolor; --darkreader-inline-border-left: currentcolor;\" data-darkreader-inline-bgcolor=\"\" data-darkreader-inline-bgimage=\"\" data-darkreader-inline-border-top=\"\" data-darkreader-inline-border-right=\"\" data-darkreader-inline-border-bottom=\"\" data-darkreader-inline-border-left=\"\">\r\n" + //
                "<span typeof=\"mw:File\"><a href=\"/wiki/File:Apollo8_Prime_Crew_(landscape_crop).jpg\" class=\"mw-file-description\" title=\"Crew of Apollo&nbsp;8\"><img alt=\"Crew of Apollo&nbsp;8\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Apollo8_Prime_Crew_%28landscape_crop%29.jpg/162px-Apollo8_Prime_Crew_%28landscape_crop%29.jpg\" decoding=\"async\" width=\"162\" height=\"122\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Apollo8_Prime_Crew_%28landscape_crop%29.jpg/243px-Apollo8_Prime_Crew_%28landscape_crop%29.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Apollo8_Prime_Crew_%28landscape_crop%29.jpg/324px-Apollo8_Prime_Crew_%28landscape_crop%29.jpg 2x\" data-file-width=\"4943\" data-file-height=\"3708\"></a></span><div class=\"thumbcaption\" style=\"padding: 0.25em 0; word-wrap: break-word;\">Crew of Apollo&nbsp;8</div></div>\r\n" + //
                "</div>\r\n" + //
                "<ul><li><a href=\"/wiki/1620\" title=\"1620\">1620</a> – The <a href=\"/wiki/Pilgrims_(Plymouth_Colony)\" title=\"Pilgrims (Plymouth Colony)\">Pilgrims</a> aboard the <i><a href=\"/wiki/Mayflower\" title=\"Mayflower\">Mayflower</a></i> landed at present-day <a href=\"/wiki/Plymouth,_Massachusetts\" title=\"Plymouth, Massachusetts\">Plymouth, Massachusetts</a>, to establish the <b><a href=\"/wiki/Plymouth_Colony\" title=\"Plymouth Colony\">Plymouth Colony</a></b>.</li>\r\n" + //
                "<li><a href=\"/wiki/1963\" title=\"1963\">1963</a> – An attempt by <a href=\"/wiki/Greek_Cypriots\" title=\"Greek Cypriots\">Greek Cypriot</a> police to search certain <a href=\"/wiki/Turkish_Cypriots\" title=\"Turkish Cypriots\">Turkish Cypriot</a> women in <a href=\"/wiki/Nicosia\" title=\"Nicosia\">Nicosia</a> escalated into <b><a href=\"/wiki/Bloody_Christmas_(1963)\" title=\"Bloody Christmas (1963)\">island-wide violence</a></b>, leading to 538 deaths and the displacement of nearly 27,000 people.</li>\r\n" + //
                "<li><a href=\"/wiki/1968\" title=\"1968\">1968</a> – <b><a href=\"/wiki/Apollo_8\" title=\"Apollo 8\">Apollo&nbsp;8</a></b> launched from <a href=\"/wiki/Kennedy_Space_Center\" title=\"Kennedy Space Center\">Kennedy Space Center</a> in Florida on a trajectory to the <a href=\"/wiki/Moon\" title=\"Moon\">Moon</a>; its crew <i>(pictured)</i> became the first humans to visit another celestial body.</li>\r\n" + //
                "<li><a href=\"/wiki/1988\" title=\"1988\">1988</a> – A bomb on board <b><a href=\"/wiki/Pan_Am_Flight_103\" title=\"Pan Am Flight 103\">Pan Am Flight&nbsp;103</a></b> detonated over <a href=\"/wiki/Lockerbie\" title=\"Lockerbie\">Lockerbie</a>, Scotland, killing 270 people.</li>\r\n" + //
                "<li><a href=\"/wiki/2018\" title=\"2018\">2018</a> – Operatives of the British <a href=\"/wiki/Special_Boat_Service\" title=\"Special Boat Service\">Special Boat Service</a> boarded the container ship <i><b><a href=\"/wiki/Grande_Tema_incident\" title=\"Grande Tema incident\">Grande Tema</a></b></i> in the <a href=\"/wiki/Thames_Estuary\" title=\"Thames Estuary\">Thames Estuary</a> to detain four stowaways who had threatened the crew.</li></ul>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist\" style=\"margin-top: 0.5em;\"><ul><li><b><a href=\"/wiki/Sun_Sheng_(Southern_Tang)\" title=\"Sun Sheng (Southern Tang)\">Sun Sheng</a></b>  (<abbr title=\"died\">d.</abbr>&nbsp;956)</li><li><b><a href=\"/wiki/Ali_ibn_Muhammad_ibn_al-Walid\" title=\"Ali ibn Muhammad ibn al-Walid\">Ali ibn Muhammad ibn al-Walid</a></b>  (<abbr title=\"died\">d.</abbr>&nbsp;1215)</li><li><b><a href=\"/wiki/Luang_Por_Dattajivo\" title=\"Luang Por Dattajivo\">Luang Por Dattajivo</a></b> (<abbr title=\"born\">b.</abbr>&nbsp;1940)</li><li><b><a href=\"/wiki/Hu_Jintao\" title=\"Hu Jintao\">Hu Jintao</a></b>  (<abbr title=\"born\">b.</abbr>&nbsp;1942)</li></ul></div>\r\n" + //
                "<div style=\"margin-top:0.5em;\">\r\n" + //
                "More anniversaries: <link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist inline nowraplinks\">\r\n" + //
                "<ul><li><a href=\"/wiki/December_20\" title=\"December 20\">December 20</a></li>\r\n" + //
                "<li><b><a href=\"/wiki/December_21\" title=\"December 21\">December 21</a></b></li>\r\n" + //
                "<li><a href=\"/wiki/December_22\" title=\"December 22\">December 22</a></li></ul>\r\n" + //
                "</div></div>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist otd-footer noprint\" style=\"text-align:right;\">\r\n" + //
                "<ul><li><b><a href=\"/wiki/Wikipedia:Selected_anniversaries/December\" title=\"Wikipedia:Selected anniversaries/December\">Archive</a></b></li>\r\n" + //
                "<li><b><a href=\"https://lists.wikimedia.org/postorius/lists/daily-article-l.lists.wikimedia.org/\" class=\"extiw\" title=\"mail:daily-article-l\">By email</a></b></li>\r\n" + //
                "<li><b><a href=\"/wiki/List_of_days_of_the_year\" title=\"List of days of the year\">List of days of the year</a></b></li></ul>\r\n" + //
                "</div></div>\r\n" + //
                "</div>\r\n" + //
                "</div>\r\n" + //
                "<div id=\"mp-lower\" class=\"MainPageBG mp-box\">\r\n" + //
                "<h2 id=\"mp-tfp-h2\" class=\"mp-h2\"><span id=\"Today.27s_featured_picture\"></span><span class=\"mw-headline\" id=\"Today's_featured_picture\">Today's featured picture</span></h2>\r\n" + //
                "<div id=\"mp-tfp\">\r\n" + //
                "<table role=\"presentation\" style=\"margin: 0px 3px 3px; width: 100%; box-sizing: border-box; text-align: left; background-color: transparent; border-collapse: collapse; --darkreader-inline-bgcolor: transparent;\" data-darkreader-inline-bgcolor=\"\">\r\n" + //
                "<tbody><tr>\r\n" + //
                "<td style=\"padding:0 0.9em 0 0; width:300px;\"><span typeof=\"mw:File\"><a href=\"/wiki/File:Leptura_quadrifasciata_female_-_Keila.jpg\" class=\"mw-file-description\" title=\"Leptura quadrifasciata\"><img alt=\"Leptura quadrifasciata\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Leptura_quadrifasciata_female_-_Keila.jpg/300px-Leptura_quadrifasciata_female_-_Keila.jpg\" decoding=\"async\" width=\"300\" height=\"450\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Leptura_quadrifasciata_female_-_Keila.jpg/450px-Leptura_quadrifasciata_female_-_Keila.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Leptura_quadrifasciata_female_-_Keila.jpg/600px-Leptura_quadrifasciata_female_-_Keila.jpg 2x\" data-file-width=\"5504\" data-file-height=\"8256\"></a></span>\r\n" + //
                "</td>\r\n" + //
                "<td style=\"padding:0 6px 0 0\">\r\n" + //
                "<p><i><b><a href=\"/wiki/Leptura_quadrifasciata\" title=\"Leptura quadrifasciata\">Leptura quadrifasciata</a></b></i>, the longhorn beetle, is a species of <a href=\"/wiki/Beetle\" title=\"Beetle\">beetle</a> in the family <a href=\"/wiki/Longhorn_beetle\" title=\"Longhorn beetle\">Cerambycidae</a>. It is found throughout the northern and central <a href=\"/wiki/Palearctic_realm\" title=\"Palearctic realm\">Palaearctic</a> region. The species is distributed in northern and central regions of Europe and Asia. It is particularly common in Scandinavia, Finland and Great Britain, and typically seen during the summer months. The larvae make meandering galleries in various trees, including <a href=\"/wiki/Oak\" title=\"Oak\">oak</a>, <a href=\"/wiki/Beech\" title=\"Beech\">beech</a>, <a href=\"/wiki/Birch\" title=\"Birch\">birch</a>, <a href=\"/wiki/Willow\" title=\"Willow\">willow</a>, <a href=\"/wiki/Alder\" title=\"Alder\">alder</a>, <a href=\"/wiki/Sambucus\" title=\"Sambucus\">elder</a> and <a href=\"/wiki/Spruce\" title=\"Spruce\">spruce</a>&nbsp;– typically in dead and decaying wood, with a preference for damp areas. Adult beetles are 11 to 20 millimetres (0.43 to 0.79&nbsp;in) long, black with four more or less continuous transverse yellow bands. In extreme cases the <a href=\"/wiki/Elytron\" title=\"Elytron\">elytra</a> may be almost entirely black. The life cycle of the species lasts two or three years. This <i>L.&nbsp;quadrifasciata</i> female was photographed on <a href=\"/wiki/Daucus_carota\" title=\"Daucus carota\">wild carrot</a> flowers near <a href=\"/wiki/Keila\" title=\"Keila\">Keila</a>, Estonia.\r\n" + //
                "</p>\r\n" + //
                "<p style=\"text-align:left;\"><small>Photograph credit: <a href=\"https://commons.wikimedia.org/wiki/User:Iifar\" class=\"extiw\" title=\"c:User:Iifar\">Ivar Leidus</a></small></p>\r\n" + //
                "<div class=\"potd-recent\" style=\"text-align:right;\">\r\n" + //
                "Recently featured: <link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist inline\">\r\n" + //
                "<ul><li><a href=\"/wiki/Template:POTD/2023-12-20\" title=\"Template:POTD/2023-12-20\">Walter Q. Gresham</a></li>\r\n" + //
                "<li><a href=\"/wiki/Template:POTD/2023-12-19\" title=\"Template:POTD/2023-12-19\">Greater crested tern</a></li>\r\n" + //
                "<li><a href=\"/wiki/Template:POTD/2023-12-18\" title=\"Template:POTD/2023-12-18\">Laguna Miñiques</a></li></ul>\r\n" + //
                "</div></div>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist potd-footer noprint\" style=\"text-align:right;\">\r\n" + //
                "<ul><li><b><a href=\"/wiki/Wikipedia:Picture_of_the_day/Archive\" title=\"Wikipedia:Picture of the day/Archive\">Archive</a></b></li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:Featured_pictures\" title=\"Wikipedia:Featured pictures\">More featured pictures</a></b></li></ul>\r\n" + //
                "</div>\r\n" + //
                "</td></tr></tbody></table></div>\r\n" + //
                "</div>\r\n" + //
                "<div id=\"mp-bottom\" class=\"mp-box\">\r\n" + //
                "<h2 id=\"mp-other\" class=\"mp-h2\"><span class=\"mw-headline\" id=\"Other_areas_of_Wikipedia\">Other areas of Wikipedia</span></h2>\r\n" + //
                "<div id=\"mp-other-content\">\r\n" + //
                "<ul><li><b><a href=\"/wiki/Wikipedia:Community_portal\" title=\"Wikipedia:Community portal\">Community portal</a></b> – The central hub for editors, with resources, links, tasks, and announcements.</li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:Village_pump\" title=\"Wikipedia:Village pump\">Village pump</a></b> – Forum for discussions about Wikipedia itself, including policies and technical issues.</li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:News\" title=\"Wikipedia:News\">Site news</a></b> – Sources of news about Wikipedia and the broader Wikimedia movement.</li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:Teahouse\" title=\"Wikipedia:Teahouse\">Teahouse</a></b> – Ask basic questions about using or editing Wikipedia.</li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:Help_desk\" title=\"Wikipedia:Help desk\">Help desk</a></b> – Ask questions about using or editing Wikipedia.</li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:Reference_desk\" title=\"Wikipedia:Reference desk\">Reference desk</a></b> – Ask research questions about encyclopedic topics.</li>\r\n" + //
                "<li><b><a href=\"/wiki/Wikipedia:Contents/Portals\" title=\"Wikipedia:Contents/Portals\">Content portals</a></b> – A unique way to navigate the encyclopedia.</li></ul>\r\n" + //
                "</div>\r\n" + //
                "<h2 id=\"mp-sister\" class=\"mp-h2\"><span id=\"Wikipedia.27s_sister_projects\"></span><span class=\"mw-headline\" id=\"Wikipedia's_sister_projects\">Wikipedia's sister projects</span></h2>\r\n" + //
                "<div id=\"mp-sister-content\"><style data-mw-deduplicate=\"TemplateStyles:r1007624485\">.mw-parser-output #sister-projects-list{display:flex;flex-wrap:wrap}.mw-parser-output #sister-projects-list li{display:inline-block}.mw-parser-output #sister-projects-list li span{font-weight:bold}.mw-parser-output #sister-projects-list li>div{display:inline-block;vertical-align:middle;padding:6px 4px}.mw-parser-output #sister-projects-list li>div:first-child{text-align:center}@media(min-width:360px){.mw-parser-output #sister-projects-list li{width:33%;min-width:20em;white-space:nowrap;flex:1 0 25%}.mw-parser-output #sister-projects-list li>div:first-child{min-width:50px}}</style><style class=\"darkreader darkreader--sync\" media=\"screen\"></style>\r\n" + //
                "<p>Wikipedia is written by volunteer editors and hosted by the <a href=\"/wiki/Wikimedia_Foundation\" title=\"Wikimedia Foundation\">Wikimedia Foundation</a>, a non-profit organization that also hosts a range of other volunteer <a href=\"https://wikimediafoundation.org/our-work/wikimedia-projects/\" class=\"extiw\" title=\"foundationsite:our-work/wikimedia-projects/\">projects</a>:\r\n" + //
                "</p>\r\n" + //
                "<style data-mw-deduplicate=\"TemplateStyles:r1126788409\">.mw-parser-output .plainlist ol,.mw-parser-output .plainlist ul{line-height:inherit;list-style:none;margin:0;padding:0}.mw-parser-output .plainlist ol li,.mw-parser-output .plainlist ul li{margin-bottom:0}</style><style class=\"darkreader darkreader--sync\" media=\"screen\"></style><div class=\"plainlist\">\r\n" + //
                "<ul id=\"sister-projects-list\">\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://commons.wikimedia.org/wiki/\" title=\"Commons\"><img alt=\"Commons logo\" src=\"//upload.wikimedia.org/wikipedia/en/thumb/4/4a/Commons-logo.svg/31px-Commons-logo.svg.png\" decoding=\"async\" width=\"31\" height=\"42\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/en/thumb/4/4a/Commons-logo.svg/47px-Commons-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/en/thumb/4/4a/Commons-logo.svg/62px-Commons-logo.svg.png 2x\" data-file-width=\"1024\" data-file-height=\"1376\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://commons.wikimedia.org/wiki/\" class=\"extiw\" title=\"c:\">Commons</a></span><br>Free media repository</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://www.mediawiki.org/wiki/\" title=\"MediaWiki\"><img alt=\"MediaWiki logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/a/a6/MediaWiki-2020-icon.svg/35px-MediaWiki-2020-icon.svg.png\" decoding=\"async\" width=\"35\" height=\"35\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/a/a6/MediaWiki-2020-icon.svg/53px-MediaWiki-2020-icon.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/a/a6/MediaWiki-2020-icon.svg/70px-MediaWiki-2020-icon.svg.png 2x\" data-file-width=\"100\" data-file-height=\"100\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://www.mediawiki.org/wiki/\" class=\"extiw\" title=\"mw:\">MediaWiki</a></span><br>Wiki software development</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://meta.wikimedia.org/wiki/\" title=\"Meta-Wiki\"><img alt=\"Meta-Wiki logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/7/75/Wikimedia_Community_Logo.svg/35px-Wikimedia_Community_Logo.svg.png\" decoding=\"async\" width=\"35\" height=\"35\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/7/75/Wikimedia_Community_Logo.svg/53px-Wikimedia_Community_Logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/7/75/Wikimedia_Community_Logo.svg/70px-Wikimedia_Community_Logo.svg.png 2x\" data-file-width=\"900\" data-file-height=\"900\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://meta.wikimedia.org/wiki/\" class=\"extiw\" title=\"m:\">Meta-Wiki</a></span><br>Wikimedia project coordination</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://en.wikibooks.org/wiki/\" title=\"Wikibooks\"><img alt=\"Wikibooks logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Wikibooks-logo.svg/35px-Wikibooks-logo.svg.png\" decoding=\"async\" width=\"35\" height=\"35\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Wikibooks-logo.svg/53px-Wikibooks-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Wikibooks-logo.svg/70px-Wikibooks-logo.svg.png 2x\" data-file-width=\"300\" data-file-height=\"300\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://en.wikibooks.org/wiki/\" class=\"extiw\" title=\"b:\">Wikibooks</a></span><br>Free textbooks and manuals</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://www.wikidata.org/wiki/\" title=\"Wikidata\"><img alt=\"Wikidata logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Wikidata-logo.svg/47px-Wikidata-logo.svg.png\" decoding=\"async\" width=\"47\" height=\"26\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Wikidata-logo.svg/71px-Wikidata-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Wikidata-logo.svg/94px-Wikidata-logo.svg.png 2x\" data-file-width=\"1050\" data-file-height=\"590\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://www.wikidata.org/wiki/\" class=\"extiw\" title=\"d:\">Wikidata</a></span><br>Free knowledge base</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://en.wikinews.org/wiki/\" title=\"Wikinews\"><img alt=\"Wikinews logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/24/Wikinews-logo.svg/51px-Wikinews-logo.svg.png\" decoding=\"async\" width=\"51\" height=\"28\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/24/Wikinews-logo.svg/77px-Wikinews-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/2/24/Wikinews-logo.svg/102px-Wikinews-logo.svg.png 2x\" data-file-width=\"759\" data-file-height=\"415\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://en.wikinews.org/wiki/\" class=\"extiw\" title=\"n:\">Wikinews</a></span><br>Free-content news</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://en.wikiquote.org/wiki/\" title=\"Wikiquote\"><img alt=\"Wikiquote logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Wikiquote-logo.svg/35px-Wikiquote-logo.svg.png\" decoding=\"async\" width=\"35\" height=\"41\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Wikiquote-logo.svg/53px-Wikiquote-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Wikiquote-logo.svg/70px-Wikiquote-logo.svg.png 2x\" data-file-width=\"300\" data-file-height=\"355\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://en.wikiquote.org/wiki/\" class=\"extiw\" title=\"q:\">Wikiquote</a></span><br>Collection of quotations</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://en.wikisource.org/wiki/\" title=\"Wikisource\"><img alt=\"Wikisource logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Wikisource-logo.svg/35px-Wikisource-logo.svg.png\" decoding=\"async\" width=\"35\" height=\"37\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Wikisource-logo.svg/53px-Wikisource-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Wikisource-logo.svg/70px-Wikisource-logo.svg.png 2x\" data-file-width=\"410\" data-file-height=\"430\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://en.wikisource.org/wiki/\" class=\"extiw\" title=\"s:\">Wikisource</a></span><br>Free-content library</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://species.wikimedia.org/wiki/\" title=\"Wikispecies\"><img alt=\"Wikispecies logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/df/Wikispecies-logo.svg/35px-Wikispecies-logo.svg.png\" decoding=\"async\" width=\"35\" height=\"41\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/df/Wikispecies-logo.svg/53px-Wikispecies-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/d/df/Wikispecies-logo.svg/70px-Wikispecies-logo.svg.png 2x\" data-file-width=\"941\" data-file-height=\"1103\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://species.wikimedia.org/wiki/\" class=\"extiw\" title=\"species:\">Wikispecies</a></span><br>Directory of species</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://en.wikiversity.org/wiki/\" title=\"Wikiversity\"><img alt=\"Wikiversity logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Wikiversity_logo_2017.svg/41px-Wikiversity_logo_2017.svg.png\" decoding=\"async\" width=\"41\" height=\"34\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Wikiversity_logo_2017.svg/62px-Wikiversity_logo_2017.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Wikiversity_logo_2017.svg/82px-Wikiversity_logo_2017.svg.png 2x\" data-file-width=\"626\" data-file-height=\"512\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://en.wikiversity.org/wiki/\" class=\"extiw\" title=\"v:\">Wikiversity</a></span><br>Free learning tools</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://en.wikivoyage.org/wiki/\" title=\"Wikivoyage\"><img alt=\"Wikivoyage logo\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Wikivoyage-Logo-v3-icon.svg/35px-Wikivoyage-Logo-v3-icon.svg.png\" decoding=\"async\" width=\"35\" height=\"35\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Wikivoyage-Logo-v3-icon.svg/53px-Wikivoyage-Logo-v3-icon.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Wikivoyage-Logo-v3-icon.svg/70px-Wikivoyage-Logo-v3-icon.svg.png 2x\" data-file-width=\"193\" data-file-height=\"193\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://en.wikivoyage.org/wiki/\" class=\"extiw\" title=\"voy:\">Wikivoyage</a></span><br>Free travel guide</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div><span typeof=\"mw:File\"><a href=\"https://en.wiktionary.org/wiki/\" title=\"Wiktionary\"><img alt=\"Wiktionary logo\" src=\"//upload.wikimedia.org/wikipedia/en/thumb/0/06/Wiktionary-logo-v2.svg/35px-Wiktionary-logo-v2.svg.png\" decoding=\"async\" width=\"35\" height=\"35\" class=\"mw-file-element\" srcset=\"//upload.wikimedia.org/wikipedia/en/thumb/0/06/Wiktionary-logo-v2.svg/53px-Wiktionary-logo-v2.svg.png 1.5x, //upload.wikimedia.org/wikipedia/en/thumb/0/06/Wiktionary-logo-v2.svg/70px-Wiktionary-logo-v2.svg.png 2x\" data-file-width=\"391\" data-file-height=\"391\"></a></span></div>\r\n" + //
                "  <div><span><a href=\"https://en.wiktionary.org/wiki/\" class=\"extiw\" title=\"wikt:\">Wiktionary</a></span><br>Dictionary and thesaurus</div>\r\n" + //
                "</li>\r\n" + //
                "</ul>\r\n" + //
                "</div></div>\r\n" + //
                "<h2 id=\"mp-lang\" class=\"mp-h2\"><span class=\"mw-headline\" id=\"Wikipedia_languages\">Wikipedia languages</span></h2>\r\n" + //
                "<div><style data-mw-deduplicate=\"TemplateStyles:r997272951\">.mw-parser-output .wikipedia-languages-complete{font-weight:bold}.mw-parser-output .wikipedia-languages ul{margin-left:0}.mw-parser-output .wikipedia-languages ul a{white-space:nowrap}.mw-parser-output .wikipedia-languages>ul{list-style:none;text-align:center;clear:both}.mw-parser-output .wikipedia-languages-count-container{width:90%;display:flex;justify-content:center;padding-top:1em;margin:0 auto}.mw-parser-output .wikipedia-languages-prettybars{width:100%;height:1px;margin:0.5em 0;background-color:#c8ccd1;flex-shrink:1;align-self:center}.mw-parser-output .wikipedia-languages-count{padding:0 1em;white-space:nowrap}</style><style class=\"darkreader darkreader--sync\" media=\"screen\"></style>\r\n" + //
                "<div class=\"wikipedia-languages nourlexpansion\">\r\n" + //
                "<p>This Wikipedia is written in <a href=\"/wiki/English_language\" title=\"English language\">English</a>. Many <a href=\"https://meta.wikimedia.org/wiki/List_of_Wikipedias\" class=\"extiw\" title=\"meta:List of Wikipedias\">other Wikipedias are available</a>; some of the largest are listed below.\r\n" + //
                "</p>\r\n" + //
                "<ul class=\"plainlinks\">\r\n" + //
                "<li>\r\n" + //
                "  <div class=\"wikipedia-languages-count-container\">\r\n" + //
                "    <div class=\"wikipedia-languages-prettybars\"></div>\r\n" + //
                "    <div role=\"heading\" aria-level=\"3\" class=\"wikipedia-languages-count\">1,000,000+ articles</div>\r\n" + //
                "    <div class=\"wikipedia-languages-prettybars\"></div>\r\n" + //
                "  </div>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist wikipedia-languages-langs inline\">\r\n" + //
                "<ul><li><a class=\"external text\" href=\"https://ar.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Arabic (ar:)\" lang=\"ar\">العربية</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://de.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"German (de:)\" lang=\"de\">Deutsch</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://es.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Spanish (es:)\" lang=\"es\">Español</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://fr.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"French (fr:)\" lang=\"fr\">Français</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://it.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Italian (it:)\" lang=\"it\">Italiano</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://nl.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Dutch (nl:)\" lang=\"nl\">Nederlands</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ja.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Japanese (ja:)\" lang=\"ja\">日本語</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://pl.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Polish (pl:)\" lang=\"pl\">Polski</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://pt.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Portuguese (pt:)\" lang=\"pt\">Português</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ru.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Russian (ru:)\" lang=\"ru\">Русский</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://sv.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Swedish (sv:)\" lang=\"sv\">Svenska</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://uk.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Ukrainian (uk:)\" lang=\"uk\">Українська</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://vi.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Vietnamese (vi:)\" lang=\"vi\">Tiếng Việt</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://zh.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Chinese (zh:)\" lang=\"zh\">中文</span></a></li></ul>\r\n" + //
                "</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div class=\"wikipedia-languages-count-container\">\r\n" + //
                "    <div class=\"wikipedia-languages-prettybars\"></div>\r\n" + //
                "    <div role=\"heading\" aria-level=\"3\" class=\"wikipedia-languages-count\">250,000+ articles</div>\r\n" + //
                "    <div class=\"wikipedia-languages-prettybars\"></div>\r\n" + //
                "  </div>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist wikipedia-languages-langs inline\">\r\n" + //
                "<ul><li><a class=\"external text\" href=\"https://id.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Indonesian (id:)\" lang=\"id\">Bahasa Indonesia</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ms.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Malay (ms:)\" lang=\"ms\">Bahasa Melayu</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://zh-min-nan.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Min Nan Chinese (nan:)\" lang=\"nan\">Bân-lâm-gú</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://bg.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Bulgarian (bg:)\" lang=\"bg\">Български</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ca.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Catalan (ca:)\" lang=\"ca\">Català</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://cs.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Czech (cs:)\" lang=\"cs\">Čeština</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://da.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Danish (da:)\" lang=\"da\">Dansk</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://eo.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Esperanto (eo:)\" lang=\"eo\">Esperanto</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://eu.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Basque (eu:)\" lang=\"eu\">Euskara</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://fa.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Persian (fa:)\" lang=\"fa\">فارسی</span></a>‎</li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://he.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Hebrew (he:)\" lang=\"he\">עברית</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://hy.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Armenian (hy:)\" lang=\"hy\">Հայերեն</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ko.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Korean (ko:)\" lang=\"ko\">한국어</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://hu.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Hungarian (hu:)\" lang=\"hu\">Magyar</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://no.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Norwegian (no:)\" lang=\"no\">Norsk bokmål</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ro.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Romanian (ro:)\" lang=\"ro\">Română</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://sr.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Serbian (sr:)\" lang=\"sr\">Srpski</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://sh.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Serbo-Croatian (sh:)\" lang=\"sh\">Srpskohrvatski</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://fi.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Finnish (fi:)\" lang=\"fi\">Suomi</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://tr.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Turkish (tr:)\" lang=\"tr\">Türkçe</span></a></li></ul>\r\n" + //
                "</div>\r\n" + //
                "</li>\r\n" + //
                "<li>\r\n" + //
                "  <div class=\"wikipedia-languages-count-container\">\r\n" + //
                "    <div class=\"wikipedia-languages-prettybars\"></div>\r\n" + //
                "    <div role=\"heading\" aria-level=\"3\" class=\"wikipedia-languages-count\">50,000+ articles</div>\r\n" + //
                "    <div class=\"wikipedia-languages-prettybars\"></div>\r\n" + //
                "  </div>\r\n" + //
                "<link rel=\"mw-deduplicated-inline-style\" href=\"mw-data:TemplateStyles:r1129693374\"><div class=\"hlist wikipedia-languages-langs inline\">\r\n" + //
                "<ul><li><a class=\"external text\" href=\"https://ast.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Asturian (ast:)\" lang=\"ast\">Asturianu</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://bn.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Bangla (bn:)\" lang=\"bn\">বাংলা</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://bs.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Bosnian (bs:)\" lang=\"bs\">Bosanski</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ckb.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Central Kurdish (ckb:)\" lang=\"ckb\">کوردی</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://et.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Estonian (et:)\" lang=\"et\">Eesti</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://el.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Greek (el:)\" lang=\"el\">Ελληνικά</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://simple.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Simple English (simple:)\" lang=\"en\">Simple English</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://fy.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Western Frisian (fy:)\" lang=\"fy\">Frysk</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ga.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Irish (ga:)\" lang=\"ga\">Gaeilge</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://gl.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Galician (gl:)\" lang=\"gl\">Galego</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://hr.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Croatian (hr:)\" lang=\"hr\">Hrvatski</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ka.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Georgian (ka:)\" lang=\"ka\">ქართული</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://lv.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Latvian (lv:)\" lang=\"lv\">Latviešu</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://lt.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Lithuanian (lt:)\" lang=\"lt\">Lietuvių</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://ml.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Malayalam (ml:)\" lang=\"ml\">മലയാളം</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://mk.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Macedonian (mk:)\" lang=\"mk\">Македонски</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://nn.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Norwegian Nynorsk (nn:)\" lang=\"nn\">Norsk nynorsk</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://pa.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Punjabi (pa:)\" lang=\"pa\">ਪੰਜਾਬੀ</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://sq.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Albanian (sq:)\" lang=\"sq\">Shqip</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://sk.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Slovak (sk:)\" lang=\"sk\">Slovenčina</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://sl.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Slovenian (sl:)\" lang=\"sl\">Slovenščina</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://th.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Thai (th:)\" lang=\"th\">ไทย</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://te.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Telugu (te:)\" lang=\"te\">తెలుగు</span></a></li>\r\n" + //
                "<li><a class=\"external text\" href=\"https://uz.wikipedia.org/wiki/\"><span class=\"autonym\" title=\"Uzbek (uz:)\" lang=\"uz\">Oʻzbekcha / ўзбекча</span></a></li></ul>\r\n" + //
                "</div>\r\n" + //
                "</li>\r\n" + //
                "</ul>\r\n" + //
                "</div></div>\r\n" + //
                "</div>\r\n" + //
                "<!-- \r\n" + //
                "NewPP limit report\r\n" + //
                "Parsed by mw‐web.eqiad.main‐56c7f4b686‐zdvn6\r\n" + //
                "Cached time: 20231221130041\r\n" + //
                "Cache expiry: 3600\r\n" + //
                "Reduced expiry: true\r\n" + //
                "Complications: [no‐toc]\r\n" + //
                "CPU time usage: 0.330\r\n" + //
                "Real time usage: 0.447\r\n" + //
                "Preprocessor visited node count: 5249\r\n" + //
                "Post‐expand include size: 139946\r\n" + //
                "Template argument size: 13613\r\n" + //
                "Highest expansion depth: 20\r\n" + //
                "Expensive parser function count: 15\r\n" + //
                "Unstrip recursion depth: 0\r\n" + //
                "Unstrip post‐expand size: 38285\r\n" + //
                "Lua time usage: 0.063\r\n" + //
                "Lua memory usage: 1814143\r\n" + //
                "Number of Wikibase entities loaded: 0\r\n" + //
                "-->\r\n" + //
                "<!--\r\n" + //
                "Transclusion expansion time report (%,ms,calls,template)\r\n" + //
                "100.00%  330.112      1 -total\r\n" + //
                " 39.30%  129.718      1 Wikipedia:Main_Page/Tomorrow\r\n" + //
                " 24.89%   82.170      9 Template:Main_page_image\r\n" + //
                " 23.74%   78.385      1 Wikipedia:Today's_featured_article/December_21,_2023\r\n" + //
                " 17.49%   57.730      9 Template:Str_number/trim\r\n" + //
                " 14.48%   47.814      2 Template:Wikipedia_languages\r\n" + //
                " 13.66%   45.078      1 Template:Did_you_know/Queue/4\r\n" + //
                " 13.47%   44.465      2 Template:Main_page_image/TFA\r\n" + //
                " 11.61%   38.342     28 Template:Flatlist\r\n" + //
                " 10.47%   34.564      2 Template:TFArecentlist\r\n" + //
                "-->\r\n" + //
                "\r\n" + //
                "<!-- Saved in parser cache with key enwiki:pcache:idhash:15580374-0!canonical and timestamp 20231221130040 and revision id 1189617895. Rendering was triggered because: page-view\r\n" + //
                " -->\r\n" + //
                "</div><!--esi <esi:include src=\"/esitest-fa8a495983347898/content\" /> --><noscript><img src=\"https://login.wikimedia.org/wiki/Special:CentralAutoLogin/start?type=1x1\" alt=\"\" width=\"1\" height=\"1\" style=\"border: none; position: absolute;\"></noscript>\r\n" + //
                "<div class=\"printfooter\" data-nosnippet=\"\">Retrieved from \"<a dir=\"ltr\" href=\"https://en.wikipedia.org/w/index.php?title=Main_Page&amp;oldid=1189617895\">https://en.wikipedia.org/w/index.php?title=Main_Page&amp;oldid=1189617895</a>\"</div></div>\r\n" + //
                "\t\t\t\t\t<div id=\"catlinks\" class=\"catlinks catlinks-allhidden\" data-mw=\"interface\"></div>\r\n" + //
                "\t\t\t\t\t\t\r\n" + //
                "<div id=\"p-lang-btn\" class=\"vector-dropdown mw-portlet mw-portlet-lang\">\r\n" + //
                "\t<input type=\"checkbox\" id=\"p-lang-btn-checkbox\" role=\"button\" aria-haspopup=\"true\" data-event-name=\"ui.dropdown-p-lang-btn\" class=\"vector-dropdown-checkbox mw-interlanguage-selector\" aria-label=\"Go to an article in another language. Available in 47 languages\">\r\n" + //
                "\t<label id=\"p-lang-btn-label\" for=\"p-lang-btn-checkbox\" class=\"vector-dropdown-label cdx-button cdx-button--fake-button cdx-button--fake-button--enabled cdx-button--weight-quiet cdx-button--action-progressive mw-portlet-lang-heading-47\" aria-hidden=\"true\"><span class=\"vector-icon mw-ui-icon-language-progressive mw-ui-icon-wikimedia-language-progressive\"></span>\r\n" + //
                "\r\n" + //
                "<span class=\"vector-dropdown-label-text\">47 languages</span>\r\n" + //
                "\t</label>\r\n" + //
                "\t<div class=\"vector-dropdown-content\">\r\n" + //
                "\r\n" + //
                "\t\t<div class=\"vector-menu-content\">\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t\t<ul class=\"vector-menu-content-list\">\r\n" + //
                "\t\t\t\t\r\n" + //
                "\t\t\t\t<li class=\"interlanguage-link interwiki-ar mw-list-item\"><a href=\"https://ar.wikipedia.org/wiki/\" title=\"Arabic\" lang=\"ar\" hreflang=\"ar\" class=\"interlanguage-link-target\"><span>العربية</span></a></li><li class=\"interlanguage-link interwiki-bn mw-list-item\"><a href=\"https://bn.wikipedia.org/wiki/\" title=\"Bangla\" lang=\"bn\" hreflang=\"bn\" class=\"interlanguage-link-target\"><span>বাংলা</span></a></li><li class=\"interlanguage-link interwiki-bg mw-list-item\"><a href=\"https://bg.wikipedia.org/wiki/\" title=\"Bulgarian\" lang=\"bg\" hreflang=\"bg\" class=\"interlanguage-link-target\"><span>Български</span></a></li><li class=\"interlanguage-link interwiki-bs mw-list-item\"><a href=\"https://bs.wikipedia.org/wiki/\" title=\"Bosnian\" lang=\"bs\" hreflang=\"bs\" class=\"interlanguage-link-target\"><span>Bosanski</span></a></li><li class=\"interlanguage-link interwiki-ca mw-list-item\"><a href=\"https://ca.wikipedia.org/wiki/\" title=\"Catalan\" lang=\"ca\" hreflang=\"ca\" class=\"interlanguage-link-target\"><span>Català</span></a></li><li class=\"interlanguage-link interwiki-cs mw-list-item\"><a href=\"https://cs.wikipedia.org/wiki/\" title=\"Czech\" lang=\"cs\" hreflang=\"cs\" class=\"interlanguage-link-target\"><span>Čeština</span></a></li><li class=\"interlanguage-link interwiki-da mw-list-item\"><a href=\"https://da.wikipedia.org/wiki/\" title=\"Danish\" lang=\"da\" hreflang=\"da\" class=\"interlanguage-link-target\"><span>Dansk</span></a></li><li class=\"interlanguage-link interwiki-de mw-list-item\"><a href=\"https://de.wikipedia.org/wiki/\" title=\"German\" lang=\"de\" hreflang=\"de\" class=\"interlanguage-link-target\"><span>Deutsch</span></a></li><li class=\"interlanguage-link interwiki-et mw-list-item\"><a href=\"https://et.wikipedia.org/wiki/\" title=\"Estonian\" lang=\"et\" hreflang=\"et\" class=\"interlanguage-link-target\"><span>Eesti</span></a></li><li class=\"interlanguage-link interwiki-el mw-list-item\"><a href=\"https://el.wikipedia.org/wiki/\" title=\"Greek\" lang=\"el\" hreflang=\"el\" class=\"interlanguage-link-target\"><span>Ελληνικά</span></a></li><li class=\"interlanguage-link interwiki-es mw-list-item\"><a href=\"https://es.wikipedia.org/wiki/\" title=\"Spanish\" lang=\"es\" hreflang=\"es\" class=\"interlanguage-link-target\"><span>Español</span></a></li><li class=\"interlanguage-link interwiki-eo mw-list-item\"><a href=\"https://eo.wikipedia.org/wiki/\" title=\"Esperanto\" lang=\"eo\" hreflang=\"eo\" class=\"interlanguage-link-target\"><span>Esperanto</span></a></li><li class=\"interlanguage-link interwiki-eu mw-list-item\"><a href=\"https://eu.wikipedia.org/wiki/\" title=\"Basque\" lang=\"eu\" hreflang=\"eu\" class=\"interlanguage-link-target\"><span>Euskara</span></a></li><li class=\"interlanguage-link interwiki-fa mw-list-item\"><a href=\"https://fa.wikipedia.org/wiki/\" title=\"Persian\" lang=\"fa\" hreflang=\"fa\" class=\"interlanguage-link-target\"><span>فارسی</span></a></li><li class=\"interlanguage-link interwiki-fr mw-list-item\"><a href=\"https://fr.wikipedia.org/wiki/\" title=\"French\" lang=\"fr\" hreflang=\"fr\" class=\"interlanguage-link-target\"><span>Français</span></a></li><li class=\"interlanguage-link interwiki-gl mw-list-item\"><a href=\"https://gl.wikipedia.org/wiki/\" title=\"Galician\" lang=\"gl\" hreflang=\"gl\" class=\"interlanguage-link-target\"><span>Galego</span></a></li><li class=\"interlanguage-link interwiki-ko mw-list-item\"><a href=\"https://ko.wikipedia.org/wiki/\" title=\"Korean\" lang=\"ko\" hreflang=\"ko\" class=\"interlanguage-link-target\"><span>한국어</span></a></li><li class=\"interlanguage-link interwiki-hr mw-list-item\"><a href=\"https://hr.wikipedia.org/wiki/\" title=\"Croatian\" lang=\"hr\" hreflang=\"hr\" class=\"interlanguage-link-target\"><span>Hrvatski</span></a></li><li class=\"interlanguage-link interwiki-id mw-list-item\"><a href=\"https://id.wikipedia.org/wiki/\" title=\"Indonesian\" lang=\"id\" hreflang=\"id\" class=\"interlanguage-link-target\"><span>Bahasa Indonesia</span></a></li><li class=\"interlanguage-link interwiki-it mw-list-item\"><a href=\"https://it.wikipedia.org/wiki/\" title=\"Italian\" lang=\"it\" hreflang=\"it\" class=\"interlanguage-link-target\"><span>Italiano</span></a></li><li class=\"interlanguage-link interwiki-he mw-list-item\"><a href=\"https://he.wikipedia.org/wiki/\" title=\"Hebrew\" lang=\"he\" hreflang=\"he\" class=\"interlanguage-link-target\"><span>עברית</span></a></li><li class=\"interlanguage-link interwiki-ka mw-list-item\"><a href=\"https://ka.wikipedia.org/wiki/\" title=\"Georgian\" lang=\"ka\" hreflang=\"ka\" class=\"interlanguage-link-target\"><span>ქართული</span></a></li><li class=\"interlanguage-link interwiki-lv mw-list-item\"><a href=\"https://lv.wikipedia.org/wiki/\" title=\"Latvian\" lang=\"lv\" hreflang=\"lv\" class=\"interlanguage-link-target\"><span>Latviešu</span></a></li><li class=\"interlanguage-link interwiki-lt mw-list-item\"><a href=\"https://lt.wikipedia.org/wiki/\" title=\"Lithuanian\" lang=\"lt\" hreflang=\"lt\" class=\"interlanguage-link-target\"><span>Lietuvių</span></a></li><li class=\"interlanguage-link interwiki-hu mw-list-item\"><a href=\"https://hu.wikipedia.org/wiki/\" title=\"Hungarian\" lang=\"hu\" hreflang=\"hu\" class=\"interlanguage-link-target\"><span>Magyar</span></a></li><li class=\"interlanguage-link interwiki-mk mw-list-item\"><a href=\"https://mk.wikipedia.org/wiki/\" title=\"Macedonian\" lang=\"mk\" hreflang=\"mk\" class=\"interlanguage-link-target\"><span>Македонски</span></a></li><li class=\"interlanguage-link interwiki-ms mw-list-item\"><a href=\"https://ms.wikipedia.org/wiki/\" title=\"Malay\" lang=\"ms\" hreflang=\"ms\" class=\"interlanguage-link-target\"><span>Bahasa Melayu</span></a></li><li class=\"interlanguage-link interwiki-nl mw-list-item\"><a href=\"https://nl.wikipedia.org/wiki/\" title=\"Dutch\" lang=\"nl\" hreflang=\"nl\" class=\"interlanguage-link-target\"><span>Nederlands</span></a></li><li class=\"interlanguage-link interwiki-ja mw-list-item\"><a href=\"https://ja.wikipedia.org/wiki/\" title=\"Japanese\" lang=\"ja\" hreflang=\"ja\" class=\"interlanguage-link-target\"><span>日本語</span></a></li><li class=\"interlanguage-link interwiki-no mw-list-item\"><a href=\"https://no.wikipedia.org/wiki/\" title=\"Norwegian Bokmål\" lang=\"nb\" hreflang=\"nb\" class=\"interlanguage-link-target\"><span>Norsk bokmål</span></a></li><li class=\"interlanguage-link interwiki-nn mw-list-item\"><a href=\"https://nn.wikipedia.org/wiki/\" title=\"Norwegian Nynorsk\" lang=\"nn\" hreflang=\"nn\" class=\"interlanguage-link-target\"><span>Norsk nynorsk</span></a></li><li class=\"interlanguage-link interwiki-pl mw-list-item\"><a href=\"https://pl.wikipedia.org/wiki/\" title=\"Polish\" lang=\"pl\" hreflang=\"pl\" class=\"interlanguage-link-target\"><span>Polski</span></a></li><li class=\"interlanguage-link interwiki-pt mw-list-item\"><a href=\"https://pt.wikipedia.org/wiki/\" title=\"Portuguese\" lang=\"pt\" hreflang=\"pt\" class=\"interlanguage-link-target\"><span>Português</span></a></li><li class=\"interlanguage-link interwiki-ro mw-list-item\"><a href=\"https://ro.wikipedia.org/wiki/\" title=\"Romanian\" lang=\"ro\" hreflang=\"ro\" class=\"interlanguage-link-target\"><span>Română</span></a></li><li class=\"interlanguage-link interwiki-ru mw-list-item\"><a href=\"https://ru.wikipedia.org/wiki/\" title=\"Russian\" lang=\"ru\" hreflang=\"ru\" class=\"interlanguage-link-target\"><span>Русский</span></a></li><li class=\"interlanguage-link interwiki-simple mw-list-item\"><a href=\"https://simple.wikipedia.org/wiki/\" title=\"Simple English\" lang=\"en-simple\" hreflang=\"en-simple\" class=\"interlanguage-link-target\"><span>Simple English</span></a></li><li class=\"interlanguage-link interwiki-sk mw-list-item\"><a href=\"https://sk.wikipedia.org/wiki/\" title=\"Slovak\" lang=\"sk\" hreflang=\"sk\" class=\"interlanguage-link-target\"><span>Slovenčina</span></a></li><li class=\"interlanguage-link interwiki-sl mw-list-item\"><a href=\"https://sl.wikipedia.org/wiki/\" title=\"Slovenian\" lang=\"sl\" hreflang=\"sl\" class=\"interlanguage-link-target\"><span>Slovenščina</span></a></li><li class=\"interlanguage-link interwiki-sr mw-list-item\"><a href=\"https://sr.wikipedia.org/wiki/\" title=\"Serbian\" lang=\"sr\" hreflang=\"sr\" class=\"interlanguage-link-target\"><span>Српски / srpski</span></a></li><li class=\"interlanguage-link interwiki-sh mw-list-item\"><a href=\"https://sh.wikipedia.org/wiki/\" title=\"Serbo-Croatian\" lang=\"sh\" hreflang=\"sh\" class=\"interlanguage-link-target\"><span>Srpskohrvatski / српскохрватски</span></a></li><li class=\"interlanguage-link interwiki-fi mw-list-item\"><a href=\"https://fi.wikipedia.org/wiki/\" title=\"Finnish\" lang=\"fi\" hreflang=\"fi\" class=\"interlanguage-link-target\"><span>Suomi</span></a></li><li class=\"interlanguage-link interwiki-sv mw-list-item\"><a href=\"https://sv.wikipedia.org/wiki/\" title=\"Swedish\" lang=\"sv\" hreflang=\"sv\" class=\"interlanguage-link-target\"><span>Svenska</span></a></li><li class=\"interlanguage-link interwiki-th mw-list-item\"><a href=\"https://th.wikipedia.org/wiki/\" title=\"Thai\" lang=\"th\" hreflang=\"th\" class=\"interlanguage-link-target\"><span>ไทย</span></a></li><li class=\"interlanguage-link interwiki-tr mw-list-item\"><a href=\"https://tr.wikipedia.org/wiki/\" title=\"Turkish\" lang=\"tr\" hreflang=\"tr\" class=\"interlanguage-link-target\"><span>Türkçe</span></a></li><li class=\"interlanguage-link interwiki-uk mw-list-item\"><a href=\"https://uk.wikipedia.org/wiki/\" title=\"Ukrainian\" lang=\"uk\" hreflang=\"uk\" class=\"interlanguage-link-target\"><span>Українська</span></a></li><li class=\"interlanguage-link interwiki-vi mw-list-item\"><a href=\"https://vi.wikipedia.org/wiki/\" title=\"Vietnamese\" lang=\"vi\" hreflang=\"vi\" class=\"interlanguage-link-target\"><span>Tiếng Việt</span></a></li><li class=\"interlanguage-link interwiki-zh mw-list-item\"><a href=\"https://zh.wikipedia.org/wiki/\" title=\"Chinese\" lang=\"zh\" hreflang=\"zh\" class=\"interlanguage-link-target\"><span>中文</span></a></li>\r\n" + //
                "\t\t\t</ul>\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t</div>\r\n" + //
                "\r\n" + //
                "\t</div>\r\n" + //
                "</div>\r\n" + //
                "\r\n" + //
                "\t\t\t\t</div>\r\n" + //
                "\t\t\t</main>\r\n" + //
                "\t\t\t\r\n" + //
                "\t\t</div>\r\n" + //
                "\t\t<div class=\"mw-footer-container\">\r\n" + //
                "\t\t\t\r\n" + //
                "<footer id=\"footer\" class=\"mw-footer\" role=\"contentinfo\">\r\n" + //
                "\t<ul id=\"footer-info\">\r\n" + //
                "\t<li id=\"footer-info-lastmod\"> This page was last edited on 12 December 2023, at 23:59<span class=\"anonymous-show\">&nbsp;(UTC)</span>.</li>\r\n" + //
                "\t<li id=\"footer-info-copyright\">Text is available under the <a rel=\"license\" href=\"//en.wikipedia.org/wiki/Wikipedia:Text_of_the_Creative_Commons_Attribution-ShareAlike_4.0_International_License\">Creative Commons Attribution-ShareAlike License 4.0</a><a rel=\"license\" href=\"//en.wikipedia.org/wiki/Wikipedia:Text_of_the_Creative_Commons_Attribution-ShareAlike_4.0_International_License\" style=\"display:none;\"></a>;\r\n" + //
                "additional terms may apply.  By using this site, you agree to the <a href=\"//foundation.wikimedia.org/wiki/Terms_of_Use\">Terms of Use</a> and <a href=\"//foundation.wikimedia.org/wiki/Privacy_policy\">Privacy Policy</a>. Wikipedia® is a registered trademark of the <a href=\"//www.wikimediafoundation.org/\">Wikimedia Foundation, Inc.</a>, a non-profit organization.</li>\r\n" + //
                "</ul>\r\n" + //
                "\r\n" + //
                "\t<ul id=\"footer-places\">\r\n" + //
                "\t<li id=\"footer-places-privacy\"><a href=\"https://foundation.wikimedia.org/wiki/Special:MyLanguage/Policy:Privacy_policy\">Privacy policy</a></li>\r\n" + //
                "\t<li id=\"footer-places-about\"><a href=\"/wiki/Wikipedia:About\">About Wikipedia</a></li>\r\n" + //
                "\t<li id=\"footer-places-disclaimers\"><a href=\"/wiki/Wikipedia:General_disclaimer\">Disclaimers</a></li>\r\n" + //
                "\t<li id=\"footer-places-contact\"><a href=\"//en.wikipedia.org/wiki/Wikipedia:Contact_us\">Contact Wikipedia</a></li>\r\n" + //
                "\t<li id=\"footer-places-wm-codeofconduct\"><a href=\"https://foundation.wikimedia.org/wiki/Special:MyLanguage/Policy:Universal_Code_of_Conduct\">Code of Conduct</a></li>\r\n" + //
                "\t<li id=\"footer-places-developers\"><a href=\"https://developer.wikimedia.org\">Developers</a></li>\r\n" + //
                "\t<li id=\"footer-places-statslink\"><a href=\"https://stats.wikimedia.org/#/en.wikipedia.org\">Statistics</a></li>\r\n" + //
                "\t<li id=\"footer-places-cookiestatement\"><a href=\"https://foundation.wikimedia.org/wiki/Special:MyLanguage/Policy:Cookie_statement\">Cookie statement</a></li>\r\n" + //
                "\t<li id=\"footer-places-mobileview\"><a href=\"//en.m.wikipedia.org/w/index.php?title=Main_Page&amp;mobileaction=toggle_view_mobile\" class=\"noprint stopMobileRedirectToggle\">Mobile view</a></li>\r\n" + //
                "<li style=\"display: none;\"><a href=\"#\">Edit preview settings</a></li></ul>\r\n" + //
                "\r\n" + //
                "\t<ul id=\"footer-icons\" class=\"noprint\">\r\n" + //
                "\t<li id=\"footer-copyrightico\"><a href=\"https://wikimediafoundation.org/\"><img src=\"/static/images/footer/wikimedia-button.png\" srcset=\"/static/images/footer/wikimedia-button-1.5x.png 1.5x, /static/images/footer/wikimedia-button-2x.png 2x\" width=\"88\" height=\"31\" alt=\"Wikimedia Foundation\" loading=\"lazy\"></a></li>\r\n" + //
                "\t<li id=\"footer-poweredbyico\"><a href=\"https://www.mediawiki.org/\"><img src=\"/static/images/footer/poweredby_mediawiki_88x31.png\" alt=\"Powered by MediaWiki\" srcset=\"/static/images/footer/poweredby_mediawiki_132x47.png 1.5x, /static/images/footer/poweredby_mediawiki_176x62.png 2x\" width=\"88\" height=\"31\" loading=\"lazy\"></a></li>\r\n" + //
                "</ul>\r\n" + //
                "\r\n" + //
                "</footer>\r\n" + //
                "\r\n" + //
                "\t\t</div>\r\n" + //
                "\t</div> \r\n" + //
                "</div> \r\n" + //
                "<div class=\"vector-settings\" id=\"p-dock-bottom\">\r\n" + //
                "\t<ul>\r\n" + //
                "\t\t<li>\r\n" + //
                "\t\t<button class=\"cdx-button cdx-button--icon-only vector-limited-width-toggle\" id=\"\" data-event-name=\"limited-width-toggle-off\"><span class=\"vector-icon mw-ui-icon-fullScreen mw-ui-icon-wikimedia-fullScreen\"></span>\r\n" + //
                "\r\n" + //
                "<span>Toggle limited content width</span>\r\n" + //
                "</button>\r\n" + //
                "</li>\r\n" + //
                "\t</ul>\r\n" + //
                "</div>\r\n" + //
                "<script>(RLQ=window.RLQ||[]).push(function(){mw.config.set({\"wgHostname\":\"mw1413\",\"wgBackendResponseTime\":136,\"wgPageParseReport\":{\"limitreport\":{\"cputime\":\"0.330\",\"walltime\":\"0.447\",\"ppvisitednodes\":{\"value\":5249,\"limit\":1000000},\"postexpandincludesize\":{\"value\":139946,\"limit\":2097152},\"templateargumentsize\":{\"value\":13613,\"limit\":2097152},\"expansiondepth\":{\"value\":20,\"limit\":100},\"expensivefunctioncount\":{\"value\":15,\"limit\":500},\"unstrip-depth\":{\"value\":0,\"limit\":20},\"unstrip-size\":{\"value\":38285,\"limit\":5000000},\"entityaccesscount\":{\"value\":0,\"limit\":400},\"timingprofile\":[\"100.00%  330.112      1 -total\",\" 39.30%  129.718      1 Wikipedia:Main_Page/Tomorrow\",\" 24.89%   82.170      9 Template:Main_page_image\",\" 23.74%   78.385      1 Wikipedia:Today's_featured_article/December_21,_2023\",\" 17.49%   57.730      9 Template:Str_number/trim\",\" 14.48%   47.814      2 Template:Wikipedia_languages\",\" 13.66%   45.078      1 Template:Did_you_know/Queue/4\",\" 13.47%   44.465      2 Template:Main_page_image/TFA\",\" 11.61%   38.342     28 Template:Flatlist\",\" 10.47%   34.564      2 Template:TFArecentlist\"]},\"scribunto\":{\"limitreport-timeusage\":{\"value\":\"0.063\",\"limit\":\"10.000\"},\"limitreport-memusage\":{\"value\":1814143,\"limit\":52428800}},\"cachereport\":{\"origin\":\"mw-web.eqiad.main-56c7f4b686-zdvn6\",\"timestamp\":\"20231221130041\",\"ttl\":3600,\"transientcontent\":true}}});});</script>\r\n" + //
                "<script type=\"application/ld+json\">{\"@context\":\"https:\\/\\/schema.org\",\"@type\":\"Article\",\"name\":\"Main Page\",\"url\":\"https:\\/\\/en.wikipedia.org\\/wiki\\/Main_Page\",\"sameAs\":\"http:\\/\\/www.wikidata.org\\/entity\\/Q5296\",\"mainEntity\":\"http:\\/\\/www.wikidata.org\\/entity\\/Q5296\",\"author\":{\"@type\":\"Organization\",\"name\":\"Contributors to Wikimedia projects\"},\"publisher\":{\"@type\":\"Organization\",\"name\":\"Wikimedia Foundation, Inc.\",\"logo\":{\"@type\":\"ImageObject\",\"url\":\"https:\\/\\/www.wikimedia.org\\/static\\/images\\/wmf-hor-googpub.png\"}},\"datePublished\":\"2002-01-26T15:28:12Z\",\"dateModified\":\"2023-12-12T23:59:34Z\",\"image\":\"https:\\/\\/upload.wikimedia.org\\/wikipedia\\/commons\\/5\\/55\\/1953_11_if_kenfagg.jpg\",\"headline\":\"Wikimedia project page\"}</script>\r\n" + //
                "\r\n" + //
                "<div id=\"mw-teleport-target\" class=\"vector-body\"></div><a accesskey=\"v\" href=\"https://en.wikipedia.org/wiki/Main_Page?action=edit\" class=\"oo-ui-element-hidden\"></a></body>"));
    }
    
    static public List<LinkWord> urlToListOfLinks(String url){
        List<LinkWord> listaLinksWords = new ArrayList<>();
        for(int i=0;i<etiquetaLinkExtractor(htmlExtractor(url)).size();i++){
            String link, word = deleteEtiquetas(wordStractorElemet(etiquetaLinkExtractor(htmlExtractor(url)).get(i)));
            if((link=linkStractorElement(etiquetaLinkExtractor(htmlExtractor(url)).get(i)))!=null && word!=null){
                listaLinksWords.add(new LinkWord(link, word));
                // System.out.println(link+" --> "+word);
            }
        }
        return listaLinksWords;
    }

    /**
     * Metodo capaz de extraer el conjunto de etiquetas <a> ... </a> de un archivo html
     * @param html
     * @return
     */
    static public List<String> etiquetaLinkExtractor(String html){
        List<String> resultado = new ArrayList<>();
        int aux=0;
        // Busca la etiqueta <a ... > ... </a> y la extrae
        while (html.indexOf("<a ", aux) != -1) {
            String a="";
            for(int i = html.indexOf("<a ", aux); i<html.indexOf("</a>", aux)+4;i++){
                a += html.charAt(i);
            }
            aux = html.indexOf("</a>", aux)+4;
            resultado.add(a);
        }

        return resultado;
    }

    /**
     * Metodo capaz de extraer una palabra de dentro de un html
     * @param element
     * @return
     */
    static String wordStractorElemet(String element){
        String palabra="";
        if (element.indexOf("href=\"")!=-1){
            palabra = "";
            for(int i=element.indexOf(">")+1;i<element.indexOf("</a>");i++){
                palabra += element.charAt(i);
            }
        }
        return palabra;
    }

    /**
     * Metodo capaz de eliminar
     * @param text
     * @return
     */
    static String deleteEtiquetas(String text){
        String resultado="";
        boolean escribir = true;
        for(int i=0;i<text.length();i++){
            if (text.charAt(i)=='<') {
                escribir = false;
            }else if(text.charAt(i)=='>'){
                escribir = true;
            }

            if (escribir && !(text.charAt(i)=='>')) {
                resultado += text.charAt(i); 
            }
        }
        resultado = resultado.equals("") ? null:resultado;
        return resultado;
    }

    /**
     * Metodo capaz de extraer el link apartir de un elemento <a href="link"> ... </a>
     * @param element
     * @return
     */
    static String linkStractorElement(String element){
        String link = null;
        if (element.indexOf("href=\"")!=-1){
            link = "";
            for(int i=element.indexOf("href=\"", 0)+6;i<element.indexOf("\"", element.indexOf("href=\"", 0)+6);i++){
                link += element.charAt(i);
            }
        }
        // Esto es ajustable para poder especificar el tipo como http o https u en este caso ambas
        link = link.startsWith("http")?link:null;
        return link;
    }

    /**
     * Metodo capaz de extrer un html de la red
     * @param urlString
     * @return
     */
    public static String htmlExtractor(String urlString){
        String codigo="", linea;
        try {
            URL url = new URL(urlString);
            URLConnection conexion = url.openConnection();
            conexion.setDoOutput(true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            while ((linea = reader.readLine()) != null) {
                codigo += linea;        
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return codigo;
    }
}