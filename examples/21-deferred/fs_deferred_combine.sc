$input v_texcoord0

/*
 * Copyright 2011-2014 Branimir Karadzic. All rights reserved.
 * License: http://www.opensource.org/licenses/BSD-2-Clause
 */

#include "../common/common.sh"

SAMPLER2D(s_albedo, 0);
SAMPLER2D(s_light,  1);

void main()
{
	vec4 albedo  = toLinear(texture2D(s_albedo, v_texcoord0) );
	vec4 light   = toLinear(texture2D(s_light,  v_texcoord0) );
	gl_FragColor = toGamma(albedo*light);
}
