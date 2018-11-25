package filter;


import javax.servlet.Filter;
import javax.servlet.FilterChain;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	@Override
	public void destroy() {
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			chain.doFilter(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
