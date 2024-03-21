package gg.jte.generated.ondemand.layout;
import hexlet.code.dto.BasePage;
import hexlet.code.util.NamedRoutes;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,21,21,21,22,22,22,22,23,23,23,25,25,32,32,32,32,32,32,32,32,32,35,35,35,35,35,35,35,35,35,42,42,42,49,49,49,49,49,49,49,49,49,52,52,52,52,52,52,52,52,52,61,61,61,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, BasePage page) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n    <title>Page analyzer</title>\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n          rel=\"stylesheet\"\r\n          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n          crossorigin=\"anonymous\">\r\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n            integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n            crossorigin=\"anonymous\"></script>\r\n</head>\r\n\r\n");
		if (page != null) {
			jteOutput.writeContent("\r\n    <div class=\"alert alert-");
			jteOutput.setContext("div", "class");
			jteOutput.writeUserContent(page.getFlashType());
			jteOutput.setContext("div", null);
			jteOutput.writeContent("\" role=\"alert\">\r\n        ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(page.getFlash());
			jteOutput.writeContent("\r\n    </div>\r\n");
		}
		jteOutput.writeContent("\r\n\r\n<body>\r\n<div class=\"container\">\r\n    <header class=\"d-flex justify-content-center py-3\">\r\n        <ul class=\"nav nav-pills\">\r\n            <li class=\"nav-item\">\r\n                <a");
		var __jte_html_attribute_0 = NamedRoutes.mainPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"nav-link active\" aria-current=\"page\">Home</a>\r\n            </li>\r\n            <li class=\"nav-item\">\r\n                <a");
		var __jte_html_attribute_1 = NamedRoutes.urlsPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"nav-link\">Pages</a>\r\n            </li>\r\n        </ul>\r\n    </header>\r\n</div>\r\n\r\n<main>\r\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n</main>\r\n\r\n<div class=\"container-xl\">\r\n    <footer class=\"footer py-3 mt-5 bg-light\">\r\n        <ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\r\n            <li class=\"nav-item\">\r\n                <a");
		var __jte_html_attribute_2 = NamedRoutes.mainPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"nav-link px-2 text-body-secondary\">Home</a>\r\n            </li>\r\n            <li class=\"nav-item\">\r\n                <a");
		var __jte_html_attribute_3 = NamedRoutes.urlsPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_3);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"nav-link px-2 text-body-secondary\">Pages</a>\r\n            </li>\r\n        </ul>\r\n        <p class=\"text-center text-body-secondary\">\r\n            Created by <a href=\"https://github.com/ArtSV86\">ArtSV86</a>\r\n        </p>\r\n    </footer>\r\n</div>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		BasePage page = (BasePage)params.getOrDefault("page", null);
		render(jteOutput, jteHtmlInterceptor, content, page);
	}
}
