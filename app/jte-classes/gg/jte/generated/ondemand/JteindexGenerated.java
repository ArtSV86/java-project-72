package gg.jte.generated.ondemand;
import hexlet.code.util.NamedRoutes;
import hexlet.code.dto.BasePage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,7,7,17,17,17,17,17,17,17,17,17,41,41,41,41,41,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BasePage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <main class=\"flex-grow-1\">\r\n        <div class=\"px-4 py-5 my-5 text-center\">\r\n            <h1 class=\"display-5 fw-bold text-body-emphasis\">\r\n                Page analyzer\r\n            </h1>\r\n            <div class=\"col-lg-6 mx-auto\">\r\n                <p class=\"lead mb-4\">\r\n                    Check websites for SEO suitability for free\r\n                </p>\r\n                <form");
				var __jte_html_attribute_0 = NamedRoutes.urlsPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\" class=\"rss-form text-body\">\r\n                    <div class=\"row\">\r\n                        <div class=\"col\">\r\n                            <div class=\"form-floating\">\r\n                                <input\r\n                                        id=\"url-input\"\r\n                                        autofocus type=\"text\"\r\n                                        required name=\"url\"\r\n                                        aria-label=\"url\"\r\n                                        class=\"form-control w-100\"\r\n                                        placeholder=\"RSS link\"\r\n                                        autocomplete=\"off\">\r\n                                <label for=\"url-input\">Put your link here</label>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"col-auto\">\r\n                            <button type=\"submit\" class=\"h-100 btn btn-lg btn-primary px-sm-5\">Check</button>\r\n                        </div>\r\n                    </div>\r\n                </form>\r\n                <p class=\"mt-2 mb-0\">Example: https://www.example.com</p>\r\n            </div>\r\n        </div>\r\n    </main>\r\n");
			}
		}, page);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BasePage page = (BasePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
