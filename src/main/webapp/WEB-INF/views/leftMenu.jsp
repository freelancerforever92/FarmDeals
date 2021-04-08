<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="nav-top-menu">
	<div class="container">
		<div class="row">
			<div class="col-sm-3" id="box-vertical-megamenus">
				<div class="box-vertical-megamenus">

					<h4 class="title">
						<span class="title-menu">Categories</span> <span
							class="btn-open-mobile pull-right home-page"> <i
							class="fa fa-bars"></i>
						</span>
					</h4>

					<ul style="list-style: none;">
						<c:set var="prodNo" value="0" />
						
						<c:if test="${!empty categoryGroups}">
							<c:forEach items="${categoryGroups }" var="categoryGroup">
								<li>
									<c:set var="prodNo" value="${groupKeyCode}" /> 
									<a href="${categoryGroup.groupKeyCode}">${categoryGroup.groupCaption}</a>
								</li>
							</c:forEach>
						</c:if>

					</ul>

				</div>
			</div>
		</div>
	</div>
</div>